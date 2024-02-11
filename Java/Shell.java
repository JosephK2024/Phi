import javax.swing.*;//For JFrame access

/**
 * A JFrame extension with added Ancestry and connections 
 * @author JK
 * @version U.1
 */
@Deprecated
public class Shell extends JFrame{
    //Ancestry
    Shell[] children;
    Shell parents[];


    /**
     * Constructors
     * 
    */

        /**
         * Constructs a {@code Shell} with 
         * nothing
         */
        public Shell(){
            super();
            
            init(null, null);
            
        }

        /**
         * Constructs a {@code Shell} with:
         * a title
         * @param title    - title of Shell created
         */
        public Shell(String title){
            super(title);

            init(null, null);
        }

        /**
         * Constructs a {@code Shell} with:
         * a starting inheritance of a parent Shell
         * @param children    - children Shell(s)
         */
        public Shell(Shell[] children){
            super();

            init(children, null);
        }

        /**
         * Constructs a {@code Shell} with:
         * a starting inheritance of a parent Shell
         * @param parent - ONE parent shell
         */
        public Shell(Shell parent){
            super();

            init(null, parent);
        }

        /**
         * Constructs a {@code Shell} with:
         * a starting inheritance of children Shells,
         * and
         * a title
         * @param title     - title of Shell created
         * @param children  - children Shell(s)
         */
        public Shell(String title, Shell[] children){
            super(title);

            init(children, null);
        }

        /**
         * Constructs a {@code Shell} with:
         * a starting inheritance of a parent Shell,
         * and
         * a title
         * @param title     - title of Shell created
         * @param parent    - ONE parent Shell
         */
        public Shell(String title, Shell parent){
            super(title);

            init(null, parent);
        }

        /**
         * Constructs a {@code Shell} with:
         * a starting inheritance of children Shell(s),
         * and
         * a parent Shell
         * @param children  - children Shell(s)
         * @param parent    - ONE parent Shell
         */
        public Shell(Shell[] children, Shell parent){
            super();

            init(children, parent);
        }

        /**
         * Constructs a {@code Shell} with:
         * a starting inheritance of a parent Shell,
         * and
         * children Shell(s),
         * and
         * a title
         * @param title     - title of Shell created
         * @param children  - children Shell(s)
         * @param parent    - ONE parent Shell
         */
        public Shell(String title, Shell[] children, Shell parent){
            super(title);

            init(children, parent);
        }

        /**
         * Constructs a {@code Shell} with:
         * a starting inheritance of some type dependent on imputted boolean,
         * and
         * a title
         * @param title     - title of Shell created
         * @param ancestry  - Shells related to created Shell
         * @param isParent  - whether Shells related are parents
         */
        public Shell(String title, Shell[] ancestry, boolean isParent){
            super(title);

            if(isParent){
                init(null, null);
                for (Shell parent:ancestry){
                    addParent(parent);
                }
            }
            else{
                init(children,null);
            }
        }

    /**
     * Initializes the {@code Shell} variables.<p>
     * Should only be used for constructors.<p>
     * 
     * @param children  - children Shell(s)
     * @param parent    - ONE parent Shell
     */
    private void init(Shell[] children, Shell parent){
        this.children = children;
        Shell[] parents = {parent};
        this.parents = parents;
    }

    public void addParent(Shell parent){
        Shell[] parents = new Shell[this.parents.length + 1];
        for (int i = 0; i > this.parents.length; i++){
            parents[i] = this.parents[i];
        }
        parents[this.parents.length +1] = parent;
        this.parents = parents;
    }

}