package newTester;

import java.util.ArrayList;

public class Object
{
	private int a;
	private int b;
	public void change(ArrayList<Integer> integer2)
	{
		//integer2 = new ArrayList<Integer>();
		integer2.set(0, 6);
	}	
	public void changeTwo(int a, int b)
	{
		a++;
		b++;
	}
	public void changeThree(BankAccount a)
	{
		a.add(10);
	}
	public String toString()
	{
		return "a: " + a + " b: " + b;
	}
	public void change(int[] arr)
	{
		arr[0]++;
	}
}
