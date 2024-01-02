public class Test {
    public static void main(String[] args){
        Shell childWindow = new Shell("child");
        //int[] testArray = new int[3];
        //System.out.println(testArray.length); 
        //for (int i = 0; i < testArray.length; i++){
        //    System.out.println(i);
        //}

        Shell mainWindow = new Shell("main");

        mainWindow.addChild(childWindow);

        //childWindow.addChild(mainWindow);

    }
}
