# Currently just making this program work under MY desktop
# Should be fairly simple to port as it is just changing file locations for every different program

import os
from shutil import copyfile

storage = "STORAGE"
fetchedData = []
recentlyClosed = ["Google"]

#knownLocations[x]([0] = appName)([1] = fetchPath)
#[x][1] = "UNK" if unknown  
knownLocations = [["DNE", "DNE"], ["Google", "C:\\Users\\Joseph\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Sessions"]]

#Close open programs and store them to look for their locations later
def close_programs():
    #store name of program
    #if applicable fetch data NOW
    #exit program
    #
    return

#Grab all data from "location" and store in fetchedData
def fetch_data(location):
    global placeholder, fetchedData
    
    data = []

    match(location.lower):
        case "google":
            n = 1
        case _:
            n = 0 #default to nothing


    if os.path.isdir(knownLocations[n-1][1]):
        for file in os.scandir(knownLocations[n-1][1]):
            fetchedData.append([location, "DATEOFCLOSINGHERE" + str(placeholder), file])
            placeholder+=1

#Setup own storge space
def update_storage(data):
    global storage
    storage = os.path.abspath(storage)
    path = storage

    if not os.path.exists(path):
        print("making storage dir")
        os.makedirs(path)

    path = os.path.join(storage, data[0])
    if not os.path.exists(path):
        print("making AppStorage")
        os.makedirs(path)
    
    path = os.path.join(path + "\\",  data[2].name)
    if not os.path.exists(path):
        try:
            copyfile(data[2], path)
            print("storing data", data[2])
        except:
            print("Program open, please close before reading files")
    else:
        print("Already Stored???")

def remove_AppData(app):
    return "stub"


placeholder = 0

close_programs()
for program in recentlyClosed:
    placeholder+=1
    fetch_data(program)

placeholder = 0
for data in fetchedData:
    
    update_storage(data)
    print(data)

for app in recentlyClosed:
    remove_AppData(app)