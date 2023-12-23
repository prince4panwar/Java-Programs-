// 4. Create a simple AWT application that displays a TextField with FlowLayout manager.
import java.awt.*;
class awt4
{
    public static void main(String args[]){
        Frame f = new Frame("Java Programs");
        TextField t1;
        t1 = new TextField("Welcome to Java");
        t1.setBounds(50,100,200,30);
        f.add(t1);
        f.setSize(400,400);
        t1.
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setVisible(true);
    }
}