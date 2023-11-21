//Java Program to Draw a Smiling Face using Graphics Class Methods
import java.applet.Applet;
import java.awt.*;

   //<applet code= appro1 width= 600 height=500 ></applet>
   
public class appro1 extends Applet 
{
  public void paint(Graphics g) 
   {
      setBackground(Color.red);
      g.setColor(Color.yellow);
      g.fillOval(100, 100, 350, 350);
      g.setColor(Color.black);
      g.fillOval(195, 190, 40, 40);
      g.fillOval(325, 190, 40, 40);
      g.drawArc(200, 290, 150, 70, 180, 180);
   }

}