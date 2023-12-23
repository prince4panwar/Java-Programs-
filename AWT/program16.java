//Create a simple AWT application that displays a TextArea with FlowLayout manager.
import java.awt.*;
import java.awt.event.*;

class textarea extends Frame {
    private TextArea textArea;

        textarea() {
        setTitle("TextArea with FlowLayout");
        setSize(400, 300);

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); 

        textArea = new TextArea(10, 30); 
        add(textArea);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        textarea app = new textarea();
        app.setVisible(true);
    }
}
