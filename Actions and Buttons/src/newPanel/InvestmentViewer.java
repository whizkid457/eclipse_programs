package newPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InvestmentViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		JButton button = new JButton("Add Interest");
		JButton button1 = new JButton("Withdrawal");
		JButton button2 = new JButton("Deposit");
		JButton button3 = new JButton("End Program");
		
		final BankAccount account = new BankAccount(INITIAL_BALANCE);
		
		final JLabel label = new JLabel("Balance: " + account.getBalance());
		
		final JTextField txt = new JTextField(10);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout());
		buttonPanel.add(button, BorderLayout.WEST);
		buttonPanel.add(button1, BorderLayout.CENTER);
		buttonPanel.add(button2, BorderLayout.EAST);
		//buttonPanel.add(button3, BorderLayout.CENTER);
		buttonPanel.add(label, BorderLayout.SOUTH);
		buttonPanel.add(txt, BorderLayout.NORTH);
		txt.setVisible(true);
		frame.add(buttonPanel);
		
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				double interest = account.getBalance() * Integer.parseInt(txt.getText())/100;
				account.deposit(interest);
				label.setText("Balance: " + account.getBalance());
			}
		}
		class WithdrawalListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				String text = txt.getText();
				account.withdraw(Integer.parseInt(text));
				label.setText("Balance: " + account.getBalance());
			}
		}
		class DepositListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				//System.out.println("Enter amount: ");
				String text = txt.getText();
				account.deposit(Integer.parseInt(text));
				label.setText("Balance: " + account.getBalance());
			}
		}
		class EndProgram implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
			}
		}
		ActionListener interestListener = new AddInterestListener();
		ActionListener withdrawListener = new WithdrawalListener();
		ActionListener depositListener = new DepositListener();
		ActionListener endProgram = new EndProgram();
		
		button.addActionListener(interestListener);
		button1.addActionListener(withdrawListener);
		button2.addActionListener(depositListener);
		button3.addActionListener(endProgram);
		
		
		frame.setSize(600, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Bank Account Viewer");
		frame.setVisible(true);
	}
	private static final double INTEREST_RATE = 10;
	private static final double INITIAL_BALANCE = 1100;
}
