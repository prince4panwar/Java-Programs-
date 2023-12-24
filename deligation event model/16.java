
// Java Program to Change Frame Background Color as Cyan.

import java.awt.*;

class ChangeBgColor extends Frame {

    public ChangeBgColor() {
        // Set the title of the frame
        setTitle("Change Color Demo");

        // Set the size of the frame
        setSize(400, 300);

        // Set the default close operation
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        // Set the initial background color
        setBackground(Color.CYAN);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the ChangeBgColor class
        ChangeBgColor colorDemo = new ChangeBgColor();

        // Wait for the frame to be closed
        colorDemo.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
