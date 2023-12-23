//Create a simple AWT application that displays a TextField with Custom Layout.
import java.awt.*;
import java.awt.event.*;

class awt5 {
    private Frame frame;
    private TextField textField;
    awt5() {
        frame = new Frame("Custom Layout Example");
        frame.setLayout(null);

        textField = new TextField();
        textField.setBounds(50, 50, 200, 30);

        frame.add(textField);

        frame.setSize(300, 150);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new awt5();
    }
}