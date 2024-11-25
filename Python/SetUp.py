# To create files that later programs will need access to 
# The "Startup" that comes before the executable
# TODO: Make this also get system information (Should only work on Windows 10 for now), need volunteers with different OS versions
# TODO: Make this in general

# File managing, OS recognition 
import platform, os
from file_management import *




### SETUP ###
def setup(filepath):
    print(filepath)
    filename = "test.py"
    create_file("C:\\Users\\Joseph\\Desktop\\Coed\\Project\\", filename)
    read_file(filename)
    


### SYS GRAB ###
# Find OS information
sys = platform.system()
release = platform.release()

# Sort through currently supported
if (sys == "Windows"): # Windows
    if (release == "Vista"or"7"or"8"or"9"or"10"):
        try:
            user = os.getlogin()
            setup("C:\\Users\\" + user + "\\AppData\\Local")
            unsuccessful = False
        except:
            unsuccessful = True
    else: # Other Windows
            print("Windows " + release)
            unsuccessful = True

elif(sys == "Linux"): # Linux
    user = os.getuid # Python documentaiton for 3.12.2 say this works
    try:
        setup("/home/" + user + "/.config" )
    except:
        unsuccessful = True
    if (unsuccessful):
        try:
            setup("/home/" + user + "/.cache")
            unsuccessful = False
        except:
            unsuccessful = True
    if (unsuccessful):
        print("Linux " + release)

elif(sys == "Darwin"): # MacOS
    user = os.getuid # Python documentaiton for 3.12.2 say this works
    try:
        setup("/Users/" + user + "/Library/Application Support")
        unsuccessful = False
    except:
        unsuccessful = True


else:
    print("The OS running")
    unsuccessful = True
if (unsuccessful):
    print("is currently not supported by this program, try looking at https://github.com/JosephK2024/Phi/ for instructions")

# The above should be removed later based on what I learned on PirateSoftware discord