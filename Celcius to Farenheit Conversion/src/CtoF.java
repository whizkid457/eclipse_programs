import java.util.Scanner;

public class CtoF 
{

	public static void main(String[] args, Scanner in) 
	{
	    @SuppressWarnings("unused")
		Scanner dog = new Scanner(System.in);
		System.out.println("Would you like to convert Celcius to Farenheit, or Farenheit to Celcius?");
		int a = in.nextInt();
		
			if (a > 0) 
			{
				Scanner cat = new Scanner(System.in);
				System.out.println("What temperature in Celcius would you like to convert to Farenheit?");
				int C = cat.nextInt();
				int F = ((9 * C)/5) + 32;
			System.out.println("If the temperature in Celcius is " + cat + " degrees, then the temperature in Farenheit is " + F + " degrees.");
			}
			if (a < 0)
			{	
				Scanner animal = new Scanner(System.in);
				System.out.println("What temperature in Farenheit would you like to convert to Celcius?");
				int F = animal.nextInt();
				int Ce = ((F - 32)/ 9) * 5;
				System.out.println("If the temperature in Farenheit is " + animal + " degrees, then the temperature in Celcius must be " + Ce + " degrees.");
			}
	}


}

