//Create an applet showing the string "Hello World" which is embedded in the HTML page.
import java.applet.Applet;
import java.awt.Graphics;
public class pro1 extends Applet
{
    public void paint (Graphics g)
    {
        g.drawString ("Hello World", 20, 20);
    }
}