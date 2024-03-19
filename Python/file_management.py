# Supplements StartUp.py and readies to be copied to another filespace after StartUp.py finishes, not recomended for public use

# whether this build is meant for the public
Public = False

import os
def create_file(filepath, filename):
    try:
        if (os.path.exists(filepath + filename)):
            if not(Public):
                cont = input(filepath + filename + " already exists, this will override anything stored in that file, continue?(Y/N): ")
                if(cont.lower() == 'n'):
                    return
                elif(cont == '?'):
                    read_file(filename)
                    create_file(filepath, filename)
                else:
                    os.remove( filepath + filename)
            else:
                print("Error: could not create file " + filepath + filename)
        open(filepath + filename, "a").write('')
    except IOError:
        print("Error: could not create file " + filepath +filename)


def read_file(filename):
    try:
        with open(filename, 'r') as f:
            contents = f.read()
            print(contents)
    except IOError:
        print("Error: could not read file " + filename)
 
def append_file(filename, text):
    try:
        with open(filename, 'a') as f:
            f.write(text)
        print("Text appended to file " + filename + " successfully.")
    except IOError:
        print("Error: could not append to file " + filename)
 
def rename_file(filename, new_filename):
    try:
        os.rename(filename, new_filename)
        print("File " + filename + " renamed to " + new_filename + " successfully.")
    except IOError:
        print("Error: could not rename file " + filename)
 
def delete_file(filename):
    try:
        os.remove(filename)
        print("File " + filename + " deleted successfully.")
    except IOError:
        print("Error: could not delete file " + filename)
