//Create an applet in Java to set font.
import java.awt.*;    
import java.applet.*;    
    public class pro13 extends Applet    
 {    
   Font f1,f2,f3;    
    
   public void  init()    
    {    
       f1 = new Font("Arial",Font.BOLD,18);    
       f2 = new Font("Forte",Font.PLAIN,24);    
       f3 = new Font("Elephant",Font.ITALIC,28);    
    }    
          
   public void  paint(Graphics g)    
   {    
      g.drawString("Welcome",50,50);    
    
      g.setFont(f1);     
      g.drawString("to ",50,80);    
    
      g.setFont(f2);     
      g.drawString("My ",50,110);    
    
      g.setFont(f3);     
      g.drawString("Website",50,140);    
   }    
 }    
    
/* <applet code = "pro13" height = 500 width =500>  
   </applet> */