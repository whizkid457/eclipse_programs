package investmentFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class InvestmentFrame extends JFrame
{
	public InvestmentFrame()
	{
		account = new BankAccount(INITIAL_BALANCE);
		resultArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
		resultArea.setEditable(false);
		
		createTextField();
		createInterestButton();
		createDepositButton();
		createPanel();
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	private void createTextField()
	{
		rateLabel = new JLabel("Enter amount: ");
		final int FIELD_WIDTH = 10;
		rateField = new JTextField(FIELD_WIDTH);
		rateField.setText("");
	}
	
	private void createInterestButton()
	{
		interestButton = new JButton("Add Interest");
		
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				double rate = Double.parseDouble(rateField.getText());
				double interest = account.getBalance() * rate/100;
				account.deposit(interest);
				resultArea.append("New Balance after " + rate + "% interest: " + account.getBalance() + "\n");
			}
		}
		ActionListener listener = new AddInterestListener();
		interestButton.addActionListener(listener);
	}
	
	private void createDepositButton()
	{
		depositButton = new JButton("Deposit");
		
		class DepositListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				double amount = Double.parseDouble(rateField.getText());
				account.deposit(amount);
				resultArea.append("New Balance after " + amount + " dollars deposited: " + account.getBalance() + "\n");
			}
		}
		
		ActionListener listen = new DepositListener();
		depositButton.addActionListener(listen);
	}
	private void createPanel()
	{
		panel = new JPanel();
		panel.add(rateLabel);
		panel.add(rateField);
		panel.add(interestButton);
		panel.add(depositButton);
		JScrollPane scrollPane = new JScrollPane(resultArea);
		panel.add(scrollPane);
		this.add(panel); //Adding frame from other class to panel which in turn has all of the labels, text fields, and buttons
	}
	private JLabel rateLabel;
	private JTextField rateField;
	private JButton interestButton;
	private JButton depositButton;
	private JTextArea resultArea;
	private JPanel panel;
	private BankAccount account;
	
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 250;
	private static final int AREA_ROWS = 10;
	private static final int AREA_COLUMNS = 35;
	private static final double DEFAULT_RATE = 5;
	private static final double INITIAL_BALANCE = 1000;
}
