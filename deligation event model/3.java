
// Java Program to Create a Button and Display Image in the Frame when Clicked.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class event {
    static JFrame frame;

    public static void main(String[] args) {
        frame = new JFrame("Button Image");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Display");
        frame.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon icon = new ImageIcon("blob3.png");
                JLabel label = new JLabel(icon);
                frame.add(label);
                frame.pack();
                frame.setSize(500, 500);
            }
        });

        frame.setVisible(true);
    }
}
