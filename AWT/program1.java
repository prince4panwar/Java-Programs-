//Create a simple AWT application that displays a button with FlowLayout manager.
import java.awt.*;
import java.awt.event.*;

class a
{
    public static void main(String[] x) 
    {
        // Create a new frame.
        Frame f = new Frame("AWT Button FlowLayout ");

        // Set the size of the frame.
        f.setSize(300, 300);

        // Handle the window closing event.
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Create a button and add it to the frame.
        Button b1= new Button("Click me!");
        f.add(b1);

        // Create a label and add it to the frame.
        Label l1 = new Label("You have not clicked the button yet.");
        f.add(l1);

        // Set the layout manager for the frame to FlowLayout.
        f.setLayout(new FlowLayout());

        // Display the frame.
        f.setVisible(true);
    }
}