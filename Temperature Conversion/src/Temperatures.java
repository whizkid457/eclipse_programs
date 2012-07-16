import java.util.Scanner;


public class Temperatures 
{
	public static void main(String[] args)
	{
		Scanner temp = new Scanner(System.in);
		System.out.println("Type C if you want to convert to Farenheit or F if you want to convert to Celcius.");
		String choice = temp.next();
		if (choice.equals("C")) 
		{
			Scanner three = new Scanner(System.in);
			System.out.println("What temperature in Celcius would you like to convert to Farenheit?");
			int C = three.nextInt();
			int F = ((9 * C)/5) + 32;
			System.out.println("If the temperature in Celcius is " + C + " degrees, then the temperature in Farenheit is " + F + " degrees.");
		}
		if (choice.equals("F"))
		{	
			Scanner four = new Scanner(System.in);
			System.out.println("What temperature in Farenheit would you like to convert to Celcius?");
			int Fa = four.nextInt();
			int Ce = ((Fa - 32)/ 9) * 5;
			System.out.println("If the temperature in Farenheit is " + Fa + " degrees, then the temperature in Celcius must be " + Ce + " degrees.");	
		}
		Scanner repeat = new Scanner(System.in);
		System.out.println("Would you like to do another temperature conversion?");
		String rep = repeat.next();
		while (rep.equals("yes"))
		{	
			System.out.println("Type C if you want to convert to Farenheit or F if you want to convert to Celcius.");
			choice = temp.next();
			if (choice.equals("C")) 
			{
				Scanner three = new Scanner(System.in);
				System.out.println("What temperature in Celcius would you like to convert to Farenheit?");
				int C = three.nextInt();
				int F = ((9 * C)/5) + 32;
				System.out.println("If the temperature in Celcius is " + C + " degrees, then the temperature in Farenheit is " + F + " degrees.");
			}
			if (choice.equals("F"))
			{	
				Scanner four = new Scanner(System.in);
				System.out.println("What temperature in Farenheit would you like to convert to Celcius?");
				int Fa = four.nextInt();
				int Ce = ((Fa - 32)/ 9) * 5;
				System.out.println("If the temperature in Farenheit is " + Fa + " degrees, then the temperature in Celcius must be " + Ce + " degrees.");
			}
			repeat = new Scanner(System.in);
			System.out.println("Would you like to do another temperature conversion?");
			rep = repeat.next();
		}
		
		if (rep.equals("no"))
		{ 
			System.out.println("Thanks and have a great day!");
		}
	}
}
	
	



