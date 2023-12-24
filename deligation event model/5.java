
// Java Program to Handle KeyBoardEvent

import java.awt.*;
import java.awt.event.*;

class Main implements KeyListener {
    static Frame frame;
    static TextField tf1;
    static TextField tf2;

    // Driver function
    public static void main(String args[]) {
        frame = new Frame("Keyboard Event");
        frame.setSize(500, 500);
        frame.setLayout(null);

        tf1 = new TextField();
        tf1.setBounds(150, 100, 500, 50);

        tf2 = new TextField();
        tf2.setBounds(140, 400, 500, 50);

        Main obj = new Main();

        tf2.addKeyListener(obj);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                frame.dispose();
            }
        });
        frame.setVisible(true);
        frame.add(tf1);
        frame.add(tf2);
    }

    public void keyReleased(KeyEvent e) {
        tf1.setText("");
        tf1.setText("Key Typed : " + e.getKeyChar());        
        System.out.println("Key Released");
    }

    // function to display the unicode of key pressed and the character if it is a letter or a digit
    public void keyPressed(KeyEvent e) {
        tf1.setText("");
        tf1.setText("Key Typed : " + e.getKeyChar());
        System.out.println("Key Pressed");
    }

    // function to display the character of the key typed
    public void keyTyped(KeyEvent e) {
        tf1.setText("");
        tf1.setText("Key Typed : " + e.getKeyChar());
    System.out.println("Key Typed");
    }
}