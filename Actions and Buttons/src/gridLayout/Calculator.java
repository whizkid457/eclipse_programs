package gridLayout;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame
{
	public JButton zero;
	public JButton one;
	public JButton two;
	public JButton three;
	public JButton four;
	public JButton five;
	public JButton six;
	public JButton seven;
	public JButton eight;
	public JButton nine;
	public JButton clear;
	public JButton add;
	public JButton subtract;
	public JButton multiply;
	public JButton divide;
	public JButton equals;
	
	public JTextField field;
	public static JPanel panel;
	public JPanel buttonPanel;
	
	public Calculator()
	{
		createOneButton();
		createTwoButton();
		createThreeButton();
		createFourButton();
		createFiveButton();
		createSixButton();
		createSevenButton();
		createEightButton();
		createNineButton();
		createClearButton();
		createAddButton();
		createSubtractButton();
		createMultiplyButton();
		createDivideButton();
		createEqualsButton();
		createZeroButton();
		createTextField();
		createPanel();
	}
	public void createPanel()
	{
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(field, BorderLayout.NORTH);
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4,3));
		buttonPanel.add(seven);
		buttonPanel.add(eight);
		buttonPanel.add(nine);
		buttonPanel.add(divide);
		buttonPanel.add(four);
		buttonPanel.add(five);
		buttonPanel.add(six);
		buttonPanel.add(multiply);
		buttonPanel.add(one);
		buttonPanel.add(two);
		buttonPanel.add(three);
		buttonPanel.add(subtract);
		buttonPanel.add(zero);
		buttonPanel.add(equals);
		buttonPanel.add(clear);
		buttonPanel.add(add);
		panel.add(buttonPanel, BorderLayout.CENTER);
		panel.setVisible(true);
	}
	public void createTextField()
	{
		field = new JTextField(10);
		field.setText("");
		field.setVisible(true);
	}
	public String getInput()
	{
		return field.getText();
	}
	public void createOneButton()
	{
		one = new JButton("1");
		class AddOneListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				field.setText(getInput() + "1");
				field.setEditable(false);
			}
		}
		ActionListener listener = new AddOneListener();
		one.addActionListener(listener);
	}
	public void createTwoButton()
	{
		two = new JButton("2");
		class AddTwoListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				field.setText(getInput() + "2");
				field.setEditable(false);
			}
		}
		ActionListener listener = new AddTwoListener();
		two.addActionListener(listener);
		
	}
	public void createThreeButton()
	{
		three = new JButton("3");
		class AddThreeListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				field.setText(getInput() + "3");
				field.setEditable(false);
			}
		}
		ActionListener listener = new AddThreeListener();
		three.addActionListener(listener);
		
	}
	public void createFourButton()
	{
		four = new JButton("4");
		class AddFourListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				field.setText(getInput() + "4");
				field.setEditable(false);
			}
		}
		ActionListener listener = new AddFourListener();
		four.addActionListener(listener);
	}
	public void createFiveButton()
	{
		five = new JButton("5");
		class AddFiveListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				field.setText(getInput() + "5");
				field.setEditable(false);
			}
		}
		ActionListener listener = new AddFiveListener();
		five.addActionListener(listener);		
	}
	public void createSixButton()
	{
		six = new JButton("6");
		class AddSixListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				field.setText(getInput() + "6");
				field.setEditable(false);
			}
		}
		ActionListener listener = new AddSixListener();
		six.addActionListener(listener);
	}
	public void createSevenButton()
	{
		seven = new JButton("7");
		class AddSevenListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				field.setText(getInput() + "7");
				field.setEditable(false);
			}
		}
		ActionListener listener = new AddSevenListener();
		seven.addActionListener(listener);
	}
	public void createEightButton()
	{
		eight = new JButton("8");
		class AddEightListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				field.setText(getInput() + "8");
				field.setEditable(false);
			}
		}
		ActionListener listener = new AddEightListener();
		eight.addActionListener(listener);
	}
	public void createNineButton()
	{
		nine = new JButton("9");
		class AddNineListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				field.setText(getInput() + "9");
				field.setEditable(false);
			}
		}
		ActionListener listener = new AddNineListener();
		nine.addActionListener(listener);
	}
	public void createClearButton()
	{
		clear = new JButton("CE");
		class AddClearListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				field.setText("");
				field.setEditable(false);
			}
		}
		ActionListener listener = new AddClearListener();
		clear.addActionListener(listener);
	}
	public void createAddButton()
	{
		 add = new JButton("+");
		 class AddListener implements ActionListener
			{
				public void actionPerformed(ActionEvent event)
				{
					field.setText(getInput() + "+");
					field.setEditable(false);
				}
			}
			ActionListener listener = new AddListener();
			add.addActionListener(listener);
	}
	public void createSubtractButton()
	{
		subtract = new JButton("-");
		class AddSubtractListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				field.setText(getInput() + "-");
				field.setEditable(false);
			}
		}
		ActionListener listener = new AddSubtractListener();
		subtract.addActionListener(listener);
	}
	public void createMultiplyButton()
	{
		multiply = new JButton("*");
		class AddMultiplyListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				field.setText(getInput() + "*");
				field.setEditable(false);
			}
		}
		ActionListener listener = new AddMultiplyListener();
		multiply.addActionListener(listener);
	}
	public void createDivideButton()
	{
		divide = new JButton("/");
		class AddDivideListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				field.setText(getInput() + "/");
				field.setEditable(false);
			}
		}
		ActionListener listener = new AddDivideListener();
		divide.addActionListener(listener);
	}
	public void createEqualsButton()
	{
		equals = new JButton("=");
		class AddEqualListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if (getInput().isEmpty()) clearAll();
				else
				{
					field.setText("" + processOperation());
				}
				field.setEditable(false);
			}
		}
		ActionListener listener = new AddEqualListener();
		equals.addActionListener(listener);
	}
	public void createZeroButton()
	{
		zero = new JButton("0");
		class AddZeroListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				field.setText(getInput() + "0");
				field.setEditable(false);
			}
		}
		ActionListener listener = new AddZeroListener();
		zero.addActionListener(listener);
	}
	public double processOperation()
	{
		String input = getInput();
		double result = 0; 
		int counter = 0;
		for (int i = 0; i < input.length(); i++)
		{	
			if (input.substring(i, i+1).equals("+")) 
			{
				if (counter > 0)
				{
					try
					{
						result += Double.parseDouble(input.substring(i));
					}
					catch (NumberFormatException n)
					{
						result += Double.parseDouble(input.substring(i, i+1));
					}
				}
				else
				{
					double firstNum = Double.parseDouble(input.substring(0, i));
					double secondNum;
					if (input.length() > i+2)
					{
						secondNum = Double.parseDouble(input.substring(i+1));
					}
					else 
					{
						secondNum = Double.parseDouble(input.substring(i+1, i+2));
					}
					result = firstNum + secondNum;
					System.out.println(firstNum + " + " + secondNum + " = " + result);
				}
				counter++;
			}
			else if (input.substring(i, i+1).equals("-"))
			{
				if (counter > 0)
				{
					try
					{
						result -= Double.parseDouble(input.substring(i));
					}
					catch (NumberFormatException n)
					{
						result -= Double.parseDouble(input.substring(i, i+1));
					}
				}
				else
				{
					double firstNum = Double.parseDouble(input.substring(0, i));
					double secondNum;
					if (input.length() > i+2)
					{
						secondNum = Double.parseDouble(input.substring(i+1));
					}
					else 
					{
						secondNum = Double.parseDouble(input.substring(i+1, i+2));
					}
					result = firstNum - secondNum;
					System.out.println(firstNum + " - " + secondNum + " = " + result);
				}
				counter++;
			}
			else if (input.substring(i, i+1).equals("*"))
			{
				if (counter > 0)
				{
					try
					{
						result *= Double.parseDouble(input.substring(i));
					}
					catch (NumberFormatException n)
					{
						result *= Double.parseDouble(input.substring(i, i+1));
					}
				}
				else
				{
					double firstNum = Double.parseDouble(input.substring(0, i));
					double secondNum;
					if (input.length() > i+2)
					{
						secondNum = Double.parseDouble(input.substring(i+1));
					}
					else 
					{
						secondNum = Double.parseDouble(input.substring(i+1, i+2));
					}
					result = firstNum * secondNum;
					System.out.println(firstNum + " * " + secondNum + " = " + result);
				}
				counter++;
			}
			else if (input.substring(i, i+1).equals("/"))
			{
				if (counter > 0)
				{
					try
					{
						result /= Double.parseDouble(input.substring(i));
					}
					catch (NumberFormatException n)
					{
						result /= Double.parseDouble(input.substring(i, i+1));
					}
				}
				else
				{
					double firstNum = Double.parseDouble(input.substring(0, i));
					double secondNum;
					if (input.length() > i+2)
					{
						secondNum = Double.parseDouble(input.substring(i+1));
					}
					else 
					{
						secondNum = Double.parseDouble(input.substring(i+1, i+2));
					}
					result = firstNum / secondNum;
					System.out.println(firstNum + " / " + secondNum + " = " + result);
				}
				counter++;
			}
		}
		return result;
	}
	public void clearAll()
	{
		field.setText("");
		field.setEditable(false);
	}
}
