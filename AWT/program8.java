//Create a simple AWT application that displays a Label with FlowLayout manager.
import java.awt.*;
class LabelExample extends Frame {

    public LabelExample() {
        super("Label Example");

        Label label = new Label("This is a label");
        add(label);

        setLayout(new FlowLayout());
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LabelExample();
    }
}