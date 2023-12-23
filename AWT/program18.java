/*
    18. Create a simple AWT application design a calculator that displays buttons, TextField with GridLayout manager
*/

class Calculator extends java.awt.Frame
/* implements java.awt.event.ActionListener */
{
	/*
		---------------
		| constructor |
		---------------
	*/
	Calculator()
	{
		setSize(400,500);
		setResizable(false);
		setLayout(null);

		add(Calculator.myField());

		Calculator.myButton(this,16);
	}
	/*
		====================================================
		| myFont | get argument size and return Font
		====================================================
	*/
	private static java.awt.Font myFont(int size)
	{
		return new java.awt.Font("Arial",0,size);
	}
	/*
		====================================================
		| myField | private function return TextField
		====================================================
	*/
	private static java.awt.TextField myField()
	{
		java.awt.TextField fld = new java.awt.TextField();

		fld.setBounds(0,0,400,100);

		fld.setEditable(true);

		fld.setFont(Calculator.myFont(25));

		fld.setForeground(java.awt.Color.BLACK);

		fld.setBackground(java.awt.Color.WHITE);

		return fld;
	}
	/*
		====================================================
		| myButton | function arguments size or Frame
		====================================================
	*/
	private static void myButton(java.awt.Frame frame,int size)
	{
		java.awt.Button btn[] = new java.awt.Button[size];

		int x = 0, y = 100;	// default coordinates

		char btn_label = ' ';

		for (int i = 0; i < size; i++)
		{
			btn[i] = new java.awt.Button();

			if (i > 9)
			{
				switch(i)
				{
					case 10 : btn_label = '+'; break;

					case 11 : btn_label = '-'; break;

					case 12 : btn_label = '*'; break;

					case 13 : btn_label = '/'; break;

					case 14 : btn_label = '%'; break;

					default : btn_label = '=';
				}
				btn[i].setLabel(""+btn_label+"");
			}
			else
			{
				btn[i].setLabel(""+i+"");
			}

			if (i != 0)
			{
				if ((i%4) == 0)
				{
					x = 0;
					y += 100;
				}
				else
				{
					x += 100;
				}
			}
			btn[i].setBounds(x,y,100,100);

			Calculator.buttonStyle(btn[i],25);

			// btn[i].addActionListener(btn[i]);

			frame.add(btn[i]);
		}
	}
	/*
		====================================================
		| buttonStyle | function get arugment size Button
		====================================================
	*/
	private static void buttonStyle(java.awt.Button btn, int size)
	{
		btn.setFont(Calculator.myFont(size));
		btn.setForeground(java.awt.Color.GRAY);
		btn.setBackground(java.awt.Color.WHITE);
	}
	/*
		===================================================
		| buttonActionStyle | get argument size and Button
		===================================================
	*/
	private static void buttonActionStyle(java.awt.Button btn, int size)
	{
		btn.setFont(Calculator.myFont(size));
		btn.setForeground(java.awt.Color.BLACK);
		btn.setBackground(java.awt.Color.WHITE);
	}
	/*
		@Override : ActionListener
	public void actionPerformed(java.awt.event.ActionEvent element)
	{
		Calculator.buttonActionStyle(this,20);

		System.out.println(" button "+this.getLabel());
	}
	*/
	/*
		[ main function ]----------------------------------
	*/
	public static void main(String args[])
	{
		System.out.println(" Calculator execute ... ");

		new Calculator().setVisible(true);
	}
}
// the end ---