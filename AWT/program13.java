//Create a simple AWT application that displays a CheckboxGroup with Custom Layout.
import java.awt.*;
import java.awt.event.*;

class checkboxgroup extends Frame {
    private CheckboxGroup checkboxGroup;

        checkboxgroup() {
        setTitle("CheckboxGroup with Custom Layout");
        setSize(300, 200);
        setLayout(new CustomLayout());

        checkboxGroup = new CheckboxGroup();
        add(new Checkbox("Option 1", checkboxGroup, false));
        add(new Checkbox("Option 2", checkboxGroup, false));
        add(new Checkbox("Option 3", checkboxGroup, false));

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] a) {
        checkboxgroup customLayoutExample = new checkboxgroup();
        customLayoutExample.setVisible(true);
    }

    class CustomLayout implements LayoutManager {
        public void addLayoutComponent(String name, Component comp) {
        }

        public void removeLayoutComponent(Component comp) {
        }

        public Dimension preferredLayoutSize(Container parent) {
            int width = 0;
            int height = 0;
            Component[] components = parent.getComponents();
            for (Component component : components) {
                Dimension prefSize = component.getPreferredSize();
                width = Math.max(width, prefSize.width);
                height += prefSize.height;
            }
            Insets insets = parent.getInsets();
            width += insets.left + insets.right;
            height += insets.top + insets.bottom;
            return new Dimension(width, height);
        }

        public Dimension minimumLayoutSize(Container parent) {
            return new Dimension(0, 0);
        }

        public void layoutContainer(Container parent) {
            int x = 0;
            int y = 0;
            int containerWidth = parent.getWidth();
            Component[] components = parent.getComponents();
            for (Component component : components) {
                Dimension prefSize = component.getPreferredSize();
                component.setBounds(x, y, containerWidth, prefSize.height);
                y += prefSize.height;
            }
        }
    }
}
