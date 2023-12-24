
//Java Program to Display Some Text in the Frame using Labels.

import javax.swing.*;

class Dem1 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Text in Frame");

    JLabel label = new JLabel("This is some text!");

    frame.add(label);

    frame.setSize(400, 400);
    frame.setVisible(true);
  }
}
