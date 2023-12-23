//Create a simple AWT application that displays a Checkbox with Custom Layout.
import java.awt.*;    
class A
{    

     A() {    
 
       Frame f = new Frame("Frame");    
 
        Checkbox checkbox1 = new Checkbox("Male");    
        
        Checkbox checkbox2 = new Checkbox("Female", true);    
       
    
  
        f.add(checkbox1);    
        f.add(checkbox2);    
  

        f.setSize(400,400);    
        f.setLayout(new FlowLayout());    
        f.setVisible(true);    
     }    

public static void main (String args[])    
{    
    new A();    
}    
}