#Langs
## Overview
> [!NOTE]
> Following shows pros with (+) and cons with (-)
#### Java
   - Doesn't work multi-platform well (-)
     - No Linux interpereter built in 
     - Crostini doesn't like the Java engine
   - Not limited to single window (+)
#### JavaScript/HTML
   - Limited mainly to browser implementation (-)
     >Frameworks can fix this however are too many for easy selection
     >ALSO creating HTML code by using JavaScript is tedium incarnate
   - Has easy access to multi-platform  (+)
#### Python 
   - Has built in Interpereters in Windows and most Linux distros (according to Google; personal Crostini device didn't have it) (+)
   - Not limited to single window (+)
   - Google(and their AI) says it can be easily translated and kept as machine code
   removing the anxiety with giving this out to others eventually (will I ever?) (?)

> [!CAUTION]
> **Using multiple languages seems like a recipe for disaster with how I work**

## Java
    First program confident in

    Might be best to just use one window for the application instead of stretching between more
    > Could use boxes to create connections inside single window with clickable "links" that expand when touched/hovered to show more info
        > See app "Obsidian"

    Completely gave up on using Java for cross platform reasons (linux environment is not pretty with Java)
     > This file is saved currently for reference when creating in other langs


## JavaScript
    Attempting to learn how to use JavaScript to do multi-platform

    First need to learn file extension
     > .js
    Second learn how to run js files
     > Requires html?
     >>Framework could change this
     >>>Too much effort

    Might be a good idea to switch from Java and JavaScript for an easier time for me
    >No it wont, would require a Java interpereter
    >>Linux would hate it along with mobile

    Probably wont use JavaScript for the main 

# Changes
Decided to mainly focus on finding a way to store and open data locally that has been taken from the Google data. This was thought to be one of my biggest hurdles in using this program but I've easily found where Google stores it's session data through quick websearches.
Removed Python files as they had nothing of worth inside and were just me messing around
Reorganized the .md files

## Next
In no particular order: 
* Creating something LEGAL to put into the world (using non-Google API is against their terms).
    > Google likely offers this with their extension system, though might not appretiate me mucking with things 
* Finding out how this same app storage system could help with potentailly starting other applications
    > Other apps are stored in the same cache system (see **Project Updates**)
* Starting up Goolge automatically instead of closing all webpages before relaunching
    > Currently the app has to close and re-open each time as I have no clue how to tell Chrome to open a particular session/tab on startup
    >> These files are encrypted heavily and probably not meant to be manipulated

After all of the above is done, I will probably be able to move on to the look and feel of the application more, as I will know what is possible (also just easier to do such things with readily availible files/data).
Should probably move these into the Project manager Github offers.


## Project Updates
Figured out how Google Re-opens past tabs/where it stores the information
 >C:\Users\User\AppData\Local\Google\Chrome\User Data\Default
 >>On Windows, Other places will be different, mobile probably has a completely different way 
 >>[WebArchive/Browser history file location](http://web.archive.org/web/20201202030319/https://www.foxtonforensics.com/browser-history-examiner/chrome-history-location#:~:text=Chrome%20Searches%20are%20stored%20in)
