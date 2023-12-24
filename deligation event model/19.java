
// Java Program to Validate the TextField for only entering numbers using KeyListener.

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Main extends Frame {
    private TextField textField;

    public Main() {
        setTitle("Number Validation Demo");
        setSize(400, 200);
        setLayout(new FlowLayout());

        textField = new TextField(20);
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Ignore non-numeric input
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Not needed for this example
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Not needed for this example
            }
        });

        add(new Label("Enter Numbers:"));
        add(textField);

        setVisible(true);

        // Close the program when the window is closed
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
