import java.util.Scanner;


public class FtoC 
{
	public static void main(String[] args)
	{
		Scanner alpha = new Scanner(System.in);
		System.out.println("Type Celcius if you want to convert to Celcius or Farenheit if you want to convert to Farenheit.");
		String choice = alpha.next();
		
			Object Celcius = null;
			if (choice.equals(Celcius)) 
			{
				Scanner three = new Scanner(System.in);
				System.out.println("What temperature in Celcius would you like to convert to Farenheit?");
				int C = three.nextInt();
				int F = ((9 * C)/5) + 32;
			System.out.println("If the temperature in Celcius is " + C + " degrees, then the temperature in Farenheit is " + F + " degrees.");
			}
			Object Farenheit = null;
			if (choice.equals(Farenheit))
			{	
				Scanner four = new Scanner(System.in);
				System.out.println("What temperature in Farenheit would you like to convert to Celcius?");
				int Fa = four.nextInt();
				int Ce = ((Fa - 32)/ 9) * 5;
				System.out.println("If the temperature in Farenheit is " + Fa + " degrees, then the temperature in Celcius must be " + Ce + " degrees.");	
	}

	}
}



