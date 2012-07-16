import java.util.Scanner;

public class GCD
{
	public static void main(String[] args) 
	{
		Scanner one = new Scanner(System.in);
		Scanner two = new Scanner(System.in);
		System.out.println("Enter two numbers that you want the GCD of: ");
		String choice = one.next();
		String choice1 = two.next();
		int n = Integer.parseInt(choice);
		int n1 = Integer.parseInt(choice1);
		int divisor = 1;
		int max = 0;
		while (divisor <= n1 || divisor <= n)
		{
	       if (n % divisor == 0)
		   {
			   if (n1 % divisor == 0)
			   {
				   if (divisor > max)
				   {
					   max = divisor;
					   divisor++;
				   }
			   }
			   divisor++;
		   }
		   divisor++;
		}
		System.out.println("The GCD of " + n + " and " + n1 + " is " + max);
	}

}

