import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;


/**
 * A window with any number of modifications based on windowType and manual inputs 
 */
public class Shell extends JFrame{
    // Basic
    JFrame shell;
    windowType windowType;
    boolean open = true;

    // Ancestry
    Shell children[];
    boolean hasChildren = false;
    Shell parent;
    boolean hasParent = false;

    // Menu
    JMenuBar menuBar;
    JMenu menu1;
    JMenuItem item;
    
    
    
    /**
     * Create and display a JFrame window
     */
    private JFrame makeShell(String title) {
        // Create window
        JFrame frame = new JFrame(title);
        
        // Set up window
            // minimum size
        Dimension minSize = new Dimension(500, 500); //TODO: create new method with Dimension Input
        frame.setMinimumSize(minSize);
            //text
        JLabel textLabel = new JLabel("LABEL", SwingConstants.CENTER);//TODO: Create new method with object in it
        frame.getContentPane().add(textLabel, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
            // menu
        menuBar = new JMenuBar();
        menu1 = new JMenu("menu 1");
        menu1.setMnemonic(KeyEvent.VK_A);
        menu1.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
        menuBar.add(menu1);
        item = new JMenuItem("exit", KeyEvent.VK_T);
        //item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        item.getAccessibleContext().setAccessibleDescription("doesn't really do anything");
        menu1.add(item);

        frame.setJMenuBar(menuBar);
        

         

        // Display window
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);// always true
        return frame;

    }
    
    /**
     * Dispose of all children this Window has
     */
    private void closeChildren(){
        for(int childNum = 0; childNum < this.children.length; childNum++){
            this.children[childNum].close();
        }
    }

    /**
     * Dispose this Window 
     */
    public void close(){
        if (hasChildren){
            closeChildren();
        }
        this.dispose();
        if(!this.hasParent){
            System.exit(0);
        }
    }

    /**
     * Hide the children of this Window
     */
    private void hideChildren(){
        for(int childNum = 0; childNum < this.children.length; childNum++){
            this.children[childNum].hide();
        }
    }

    /**
     * Hide this Window and store it's information on the parent window
     */
    public void hide(){
        if(hasChildren){
            hideChildren();
        }
        this.setVisible(false);
        this.open = false;
        
    }

    /**
     * Create a window
     */
    public Shell(String title, Shell parentShell){
        this.shell = makeShell(title);
        this.parent = parentShell;
        hasParent = true;
    }
    
    /**
     * Create parentless window 
     */
    public Shell(String title){
        this.shell = makeShell(title);
    }

    /**
     * Create the main window
     */
    public Shell(windowType windowType){
        //TODO: Main window interface
        switch(windowType) {
            //TODO: give each window properties of its windowType
        }
        this.windowType = windowType;
        // placeholder
        this.shell = makeShell("placeholder");
    }


    public void addChild(Shell child){
        Shell[] storedShells;
        if(hasChildren){
            storedShells = new Shell[children.length + 1];
            for (int shellNum = 0; shellNum <= this.children.length; shellNum++){
                storedShells[shellNum] = this.children[shellNum];
            } 
            storedShells[storedShells.length] = child;
        }
        else{
            storedShells = new Shell[1];
            storedShells[0] = child; 
        }
        children = storedShells;
        child.changeParent(this);
        hasChildren = true;
    }

    public void changeParent(Shell parent){
        this.parent = parent;
        this.hasParent = true;
    }
}