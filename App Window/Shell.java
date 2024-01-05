import javax.swing.*;//For JFrame access

public class Shell extends JFrame{
    //Ancestry
    Shell[] children;
    Shell parent;


    /**
     * Constructors
     * 
     */

    /**
     * Constructs a Shell with nothing
     */
    public Shell(){
        super();
        
        this.children = null;
        this.parent = null;
    }

    /**
     * Constructs a {code @Shell} with with a title
     * @param title     title of Shell created
     */
    public Shell(String title){
        super(title);

        init(null, null);
    }

    /**
     * Constructs a {code @Shell} with a starting inheritance of children Shells
     * @param children      children Shells
     */
    public Shell(Shell[] children){
        super();

        init(children, null);
    }

    /**
     * Constructs a {code @Shell} with a starting inheritance of a parent Shell
     * @param parent
     */
    public Shell(Shell parent){
        super();

        init(null, parent);
    }

    /**
     * Constructs a {code @Shell} with
     * a starting inheritance of children Shells
     * and
     * a title
     * @param title
     * @param children
     */
    public Shell(String title, Shell[] children){
        super(title);

        init(children, null);
    }

    /**
     * Constructs a {code @Shell} with
     * 
     * @param title
     * @param parent
     */
    public Shell(String title, Shell parent){
        super(title);
        
        init(null, parent);
    }

    /**
     * 
     * @param children
     * @param parent
     */
    public Shell(Shell[] children, Shell parent){
        super();

        init(children, parent);
    }

    /**
     * 
     * @param title
     * @param children
     * @param parent
     */
    public Shell(String title, Shell[] children, Shell parent){
        super(title);

        init(children, parent);
    }

    private void init(Shell[] children, Shell parent){
        this.children = children;
        this.parent = parent;
    }
}
