//Create an applet in Java to draw a rectangle.
import java.applet.*;
import java.awt.*;

public class pro5 extends Applet {
    public void paint(Graphics g) {
        g.drawRect(50, 50, 200, 100);
    }
}
/*<applet code="pro5" width="400" height="400"></applet> */