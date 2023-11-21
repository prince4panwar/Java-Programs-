//Create an applet in Java to draw a circle.
import java.applet.*;
import java.awt.*;

public class  pro3 extends Applet
{
    int x=300,y=100,r=50;
    public void paint(Graphics g)
    {
        g.drawOval(x-r,y-r,100,100);
        g.drawString("Circle",275,100);
        
       
   }
}
//<applet code= pro3 width= 600 height=500 ></applet>