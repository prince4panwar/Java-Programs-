//Create a simple AWT application that displays a TextArea with Custom Layout.
import java.awt.*;
import java.awt.event.*;

class CustomLayoutExample {
    public static void main(String[] args) {
        
        Frame frame = new Frame("Custom Layout Example");

       
        TextArea textArea = new TextArea("This is a TextArea with a custom layout.");

        
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Add some padding

        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        frame.add(textArea, gbc);

        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

       
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}