import java.util.*;
public class base
{
	public static void main(String[] args)
	{
		Scanner base = new Scanner(System.in);
		System.out.print("Enter a number that you want to convert to base 2: ");
		long number = base.nextLong();
		String answer = Long.toBinaryString(number);
		
		System.out.println("Base 10: " + number + " Base 2: " + answer);
	}
}
