package addInterestRate;
public class BankAccount
{
	private double balance;
	public BankAccount(double balance)
	{
		this.balance = balance;
	}
	public void deposit(double amount)
	{
		balance += amount;
	}
	public double getBalance()
	{
		return balance;
	}
}
