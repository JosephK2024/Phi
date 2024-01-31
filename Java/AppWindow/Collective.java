@Deprecated
public class Collective {
    Shell[] children;
    Shell mainWindow;
    public Collective(){
        //Shell mainWindow = new Shell("parent"); 
    }

    /**
     * Create and add a new Window Object to Collective
     */
    public void addWindow(String title){
        // Make window
        Shell newWindow = new Shell(title);

        addWindow(newWindow);    
        //mainWindow.addChild(newWindow);
    }

    /**
     * Add an already made Window Object to Collective
     */
    public void addWindow(Shell newWindow){
        // initialize array for one greater
        Shell[] storedWindows = new Shell[this.children.length + 1];
        try{
            for (int windowNum = 0; windowNum <= this.children.length; windowNum++){
                storedWindows[windowNum] = this.children[windowNum];
            } 
        }
        finally{
            storedWindows[storedWindows.length] = newWindow;
            children = storedWindows;
        }
    }
}
