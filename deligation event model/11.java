
// Java Program to Create a List Box to Select Multiple Items and Display it in the Frame.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

class MultiSelectListBoxExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        final JFrame frame = new JFrame("Multi-Select List Box Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a DefaultListModel to dynamically update the list content
        final DefaultListModel listModel = new DefaultListModel();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");
        listModel.addElement("Item 4");
        listModel.addElement("Item 5");

        // Create the JList with the DefaultListModel
        final JList listBox = new JList(listModel);
        listBox.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Create a button to display selected items
        JButton displayButton = new JButton("Display Selected Items");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get selected items
                Object[] selectedItems = listBox.getSelectedValues();

                // Display selected items in a dialog
                String message = "Selected Items: " + Arrays.toString(selectedItems);
                JOptionPane.showMessageDialog(frame, message);
            }
        });

        // Set layout and add components to the frame
        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(listBox), BorderLayout.CENTER);
        frame.add(displayButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
