import java.awt.*;
public class Test {
    public static void main(String args[]){
        // Attempt to create non-rectangle windows (hard to figure out)
        Frame wn = new Frame();
        System.out.print(wn.getBounds());
        wn.setBounds(0, 0, 1000, 1000);
        System.out.print(wn.getBounds());
        wn.setVisible(true);
        System.out.print(wn.getShape());
        // cant figure out how to use shape


        // Might be best to just use one window for the application instead of stretching between more
        // Could use boxes to create connections inside single window with clickable "links" that expand when touched/hovered to show more info
        // See app "Obsidian"
    }
}
