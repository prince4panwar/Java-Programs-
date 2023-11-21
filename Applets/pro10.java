// Create an applet in Java to draw a arc.
import java.applet.Applet;
import java.awt.*;


public class pro10 extends Applet
{
    public void paint(Graphics g){
        setForeground(Color.red);
        g.drawArc(10,10,50,100,10,45);
        g.fillArc(100,10,1000,100,0,90);

    }
}
/*<applet code="pro10" width="400" height="400"></applet> */