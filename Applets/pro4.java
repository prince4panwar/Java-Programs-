//Create an applet in Java to draw a polygon.
import java.applet.Applet;
import java.awt.*;
 public class pro4 extends Applet
 {
 
public void paint( Graphics g )
{
int x[] = { 20, 40, 50, 30, 20, 15 }; 
int y[] = { 50, 50, 60, 80, 80, 60 }; 
int num=5;
g.setColor(Color.blue); 
g.drawPolygon(x,y, num);
 
}
}
//<applet code= pro4 width= 600 height=500 ></applet>