import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class practice extends Frame implements KeyListener{
    public static void main(String arg[])
    {
        practice p = new practice();
        
    }
    practice()
    {
        Button b1 = new Button("Button1");
        add(b1);
        b1.addKeyListener(this);
        Checkbox c1 = new Checkbox("10th",null,false);
        Checkbox c2 = new Checkbox("12th",null,false);
        Checkbox c3 = new Checkbox("Graduate",null,false);
        Checkbox c4 = new Checkbox("Post Graduate",null,false);
    
        c1.setBounds(10, 20, 100, 30);
        c2.setBounds(10, 60, 100, 30);
        c3.setBounds(10, 110, 100, 30);
        c4.setBounds(10, 150, 100, 30);
    
        Choice chList = new Choice();
        chList.add("10th");
        chList.add("12th");
        chList.add("Under Graduate");
        chList.add("Graduate");
        chList.add("Post Graduate");
        
       setVisible(true);
       setLayout(new GridLayout(2,3));
       setSize(500,500);
    
       add(c1);
       add(c2);
       add(c3);
       add(c4);
       
       add(chList);
    }
    public void keyPressed(KeyEvent e)
    {
        // JOptionPane.showMessageDialog(null,"Button is pressed");
    }
    public void keyTyped(KeyEvent e)
    {
        // JOptionPane.showMessageDialog(null,"Button is Typed");
    }
    public void keyReleased(KeyEvent e)
    {
        JOptionPane.showMessageDialog(null,"Button is released");
    }
}
