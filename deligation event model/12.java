
// Java Program to Display a Message in a New Frame.

import javax.swing.*;
import java.awt.event.*;
class Message implements ActionListener
{
  
    public static void main(String args[])
    {
	
	JFrame frame = new JFrame("Original Frame");
	frame.setSize(300,300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
	
	Message obj = new Message();
 
	
	JButton button = new JButton("View Message");
	frame.add(button);
	button.addActionListener(obj);
 
	
	frame.setVisible(true);
    }
   
    public void actionPerformed(ActionEvent e)
    {
	
	JFrame sub_frame = new JFrame("Sub Frame");
	sub_frame.setSize(200,200);
 
	
	JLabel label = new JLabel("!!! Hello !!!");
	sub_frame.add(label);
 
	
	sub_frame.setVisible(true);
    }
}