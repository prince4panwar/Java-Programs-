// Create an applet in Java to draw a line.
import java.applet.Applet;
import java.awt.Graphics;
public class pro8 extends Applet{
 
 public void paint(Graphics g){
  

 //draw vertical line
 g.drawLine(10,50,20,100);
 
 //draw horizontal line
 g.drawLine(10,10,100,10);
 }
}
 //<applet code= pro8 width= 600 height=500 ></applet>