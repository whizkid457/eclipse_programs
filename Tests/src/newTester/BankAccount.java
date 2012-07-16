package newTester;

public class BankAccount
{
	private double balance;
	public BankAccount(double value)
	{
		this.balance = value;
	}
	public BankAccount add(double value) { return new BankAccount(balance += value); }
	public String toString() { return "Balance: " + balance; }
} 
