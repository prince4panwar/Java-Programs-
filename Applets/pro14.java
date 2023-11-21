//Create an applet to display a digital clock.
import java.awt.*;
import java.applet.Applet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class pro14 extends Applet {
    DateFormat dateFormat;
    Date date;
    Thread t;
    public void init() {
        this.setSize(300,200);
    }
    public void paint(Graphics g)
    {
        try
        {
            Font f=new Font("Arial",Font.BOLD,50);
            g.setFont(f);
            g.setColor(Color.DARK_GRAY);
            dateFormat = new SimpleDateFormat("hh:mm:ss a");
            date = new Date();
            g.drawString(dateFormat.format(date),5,100);
            Font f1=new Font("Arial",Font.BOLD,10);
            g.setFont(f1);
            t.sleep(1000);
            repaint();
        }catch(Exception e)
        {
        
        }
    }
}
/* <applet code = "pro14" height = 500 width =500>  
   </applet> */