//Create an applet in Java to draw a square.
import java.applet.*;
import java.awt.*;

public class pro6 extends Applet {
    public void paint(Graphics g) {
        g.drawRect(50, 50, 200, 200);
    }
}
/*<applet code="pro6" width="400" height="400"></applet> */