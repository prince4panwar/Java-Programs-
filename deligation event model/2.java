
// Java Program to Create Text Area and Password Field.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Login implements ActionListener
{
	static JTextField name;
	static JPasswordField pswd; 
	static JButton view;
	static JTextField text;
	public static void main(String args[])
	{
		JFrame frame=new JFrame("Login");
		frame.setSize(500,400);
		frame.setLayout(null);
		frame.setBackground(Color.white);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l_name=new JLabel("Name :");
		JLabel l_pswd=new JLabel("Password :");
		l_name.setBounds(50,50,50,50);
		l_pswd.setBounds(20,100,80,50);
		frame.add(l_name);
		frame.add(l_pswd);
		name=new JTextField();
		pswd=new JPasswordField();
		name.setBounds(100,50,250,50);
		pswd.setBounds(100,100,250,50);
		frame.add(name);
		frame.add(pswd);
		view=new JButton("View");
		view.setBounds(150,200,100,50);
		frame.add(view);
		text=new JTextField();
		text.setBounds(0,250,400,50);
		frame.add(text);
		Login obj=new Login();
		view.addActionListener(obj);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String pass=String.valueOf(pswd.getPassword());
		text.setText("Username = "+name.getText());
		text.setText(text.getText()+" Password = "+pass);
	}
}