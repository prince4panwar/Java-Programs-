// Create a simple AWT application that displays a Checkbox with FlowLayout manager.
import java.awt.*;

class CheckboxExample extends Frame {

    public CheckboxExample() {
        super("Checkbox Example");

        Checkbox checkbox = new Checkbox("I am Heena");
        add(checkbox);

        setLayout(new FlowLayout());
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckboxExample();
    }
}