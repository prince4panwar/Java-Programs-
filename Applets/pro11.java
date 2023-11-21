//Create an applet in Java to change the background color.
import java.applet.Applet;
import java.awt.*;

public class pro11 extends Applet {
   
    public pro11() {
        setBackground(Color.red);
    }

    public void paint(java.awt.Graphics g) {

        g.drawString("Background Color Changed", 50, 50);
    }
    /*
     * <applet code="pro11.class" width="300" height="300">
     * </applet>
     */
}