//Create a simple AWT application that displays a List with FlowLayout manager.
import java.awt.*;

class lists extends Frame{
lists(){
Label l1= new Label("COURSES OFFERED:-  ");
Label l2= new Label("1.BCA");
Label l3= new Label("2.BBA");
Label l4= new Label("3.BCOM");
Label l5= new Label("4.BA"); Label l6= new Label("5.MBA"); 
Label l7= new Label("6.Bsc");
l1.setFont(new Font("Arial", Font.PLAIN,24));
l2.setFont(new Font("Arial", Font.PLAIN,20));
l3.setFont(new Font("Arial", Font.PLAIN,20));
l4.setFont(new Font("Arial", Font.PLAIN,20));
l5.setFont(new Font("Arial", Font.PLAIN,20));
l6.setFont(new Font("Arial", Font.PLAIN,20));
l7.setFont(new Font("Arial", Font.PLAIN,20));
setSize(900,500);
setVisible(true);
setLayout(new FlowLayout());
add(l1);add(l2);add(l3);add(l4);add(l5);
}
public static void main(String s[]){
new lists();
}}