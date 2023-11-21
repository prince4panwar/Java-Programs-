//Create an applet in Java to draw a oval.
import java.awt.*;
import java.applet.Applet;
 
public class pro9 extends Applet {
 
    public void paint(Graphics g)
    {
       // draw a ellipse
        g.drawOval(100, 100, 150, 100);
    }
}
/*<applet code="pro9" width="500" height="500"></applet> */