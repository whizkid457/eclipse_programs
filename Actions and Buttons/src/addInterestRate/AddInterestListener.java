package addInterestRate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddInterestListener implements ActionListener
{
	private final double INTEREST_RATE = 10;
	private final double INITIAL_BALANCE = 1100;
	final BankAccount account = new BankAccount(INITIAL_BALANCE);
	public void actionPerformed(ActionEvent event)
	{
		double interest = account.getBalance() * INTEREST_RATE/100;
		account.deposit(interest);
		System.out.println("Current balance: " + account.getBalance());
	}
	
}
