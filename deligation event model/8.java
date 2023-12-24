
// Java Program to Create Check Boxes and Radio Buttons.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Button_Checkbox implements ActionListener,ItemListener
{
    static JFrame frame;
    static JLabel text1,text2;
    static JCheckBox[] checkbox;
    static JRadioButton[] button;
    
    public static void main(String args[])
    {
      
	frame=new JFrame("Buttons & Checkboxes");
	frame.setSize(600,600);
	frame.setLayout(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setBackground(Color.white);
	
	text1=new JLabel("");
	text1.setBounds(0,450,600,50);
	frame.add(text1);
	text2=new JLabel("");
	text2.setBounds(0,500,600,50);
	frame.add(text2);
	
	Button_Checkbox obj=new Button_Checkbox();
	
	button=new JRadioButton[3];
	for(int i=0;i<3;i++)
	{
		button[i]=new JRadioButton("Button "+(i+1));
		button[i].setBounds(200,i*80,100,50);
		frame.add(button[i]);
		button[i].addActionListener(obj);
	}
	
	checkbox=new JCheckBox[3];
	for(int i=0;i<3;i++)
	{
		checkbox[i]=new JCheckBox("Checkbox"+(i+1));
		checkbox[i].setBounds(220,(240)+i*80,100,50);
		frame.add(checkbox[i]);
		checkbox[i].addItemListener(obj);
	}
	
	frame.setVisible(true);
    }
   
    public void actionPerformed(ActionEvent e)
    {
        String s="";
	for(int i=0;i<3;i++)
	{
	    if(button[i].isSelected())
	        s=s+" "+button[i].getText();
	}
	text1.setText("Button(s) Selected : "+" "+s);
    }
   
    public void itemStateChanged(ItemEvent e)
    {
        String s="";
	for(int i=0;i<3;i++)
	{	
	    if(checkbox[i].isSelected())
	        s=s+" "+checkbox[i].getText();				
	}
	text2.setText("Checkbox(s) Selected : "+s);	
    }
}