//Create an applet in Java to draw rounded rectangle.
import java.awt.*;
import java.applet.Applet;
 
public class pro12 extends Applet {
 
    public void paint(Graphics g)
    {
          g.drawRoundRect(10,130,50,70,20,20);
          g.fillRoundRect(70,130,50,70,20,20);
    }
}
/*<applet code="pro12" width="500" height="500"></applet> */