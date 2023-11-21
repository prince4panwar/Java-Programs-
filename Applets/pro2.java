//Create an applet showing the string "Hello World" which is executed by an appletviewer.
import java.applet.Applet;
import java.awt.*;

 //<applet code= pro2 width= 600 height=500 ></applet>

 public class pro2 extends Applet {
   
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawString("hello world", 20, 20);
    }
    
}