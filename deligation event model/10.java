
// Java Program to Create and Set Border to Push Buttons.

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class ButtonBorderExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Button Border Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons with different borders
        JButton button1 = new JButton("Button 1");
        button1.setBorder(BorderFactory.createLineBorder(Color.BLUE)); // Blue line border

        JButton button2 = new JButton("Button 2");
        button2.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED)); // Raised etched border

        // Set layout and add buttons to the frame
        frame.setLayout(new FlowLayout());
        frame.add(button1);
        frame.add(button2);

        frame.setVisible(true);
    }
}
