
// Java Program to Handle MouseEvent.

import javax.swing.*;
import java.awt.event.*;

class MouseEventExample extends JFrame {

    private JLabel label;

    public MouseEventExample() {
        setTitle("Mouse Event Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Move or Click the Mouse");
        label.setHorizontalAlignment(JLabel.CENTER);

        JPanel panel = new JPanel();
        panel.addMouseListener(new CustomMouseListener());
        panel.addMouseMotionListener(new CustomMouseListener());
        panel.add(label);

        add(panel);
    }

    private class CustomMouseListener implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            label.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            label.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            label.setText("Mouse Entered at (" + e.getX() + ", " + e.getY() + ")");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            label.setText("Mouse Exited at (" + e.getX() + ", " + e.getY() + ")");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            label.setText("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            label.setText("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")");
        }
    }

    public static void main(String[] args) {
            MouseEventExample example = new MouseEventExample();
            example.setVisible(true);
        }
    }
