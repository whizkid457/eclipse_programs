import java.util.*;
public class GuessingGame
{
	public static void main(String[] args) 
	{
		Random number = new Random();
		int newnumber = 0, counter = 1, duplicate = 0, rangeLow = 50, rangeHigh = 0, count_Yes = 0;
		System.out.println("Think of a number between 0 - 50 and I will try to guess that number.");
		newnumber = number.nextInt(49) + 2;
		try 
		{
			Thread.sleep(2000);
		} catch(InterruptedException ie)
		{
		} 
		Scanner answer = new Scanner(System.in);
		System.out.print("Is the number " + newnumber + "? (Enter y or n)");
		String string = answer.nextLine();
		while (true)
		{
			if (string.equals("y"))
			{
				System.out.println("The number you thought of is " + newnumber);
				System.out.println("It took me " + counter + " tries to guess your number!");
				break;
			}
			if (string.equals("n"))
			{
				System.out.print("Is your number less than " + newnumber + "?");
				string = answer.nextLine();
				if (string.equals("y"))
				{
					count_Yes++;
					if (counter == 1 && newnumber > rangeHigh) rangeHigh = newnumber;
					if (count_Yes == 1) rangeHigh = 50;
					if (newnumber < rangeHigh)rangeHigh = newnumber;
					if (rangeLow == 50)
					{
						rangeLow = 0;
						newnumber = number.nextInt(rangeHigh - rangeLow);
					}
					else 
					{
						duplicate = newnumber;
						newnumber = number.nextInt(rangeHigh - rangeLow) + rangeLow;
						while(duplicate == newnumber) newnumber = number.nextInt(rangeHigh); 
					}
				}	
				if (string.equals("n"))
				{ 
					if (counter == 1 || counter == 2 && newnumber < rangeLow)rangeLow = newnumber;
					if (newnumber > rangeLow) rangeLow = newnumber;
					if (rangeHigh == 0) 
					{
						rangeHigh = 50;
						newnumber = number.nextInt(rangeHigh - rangeLow) + rangeLow;
						while (duplicate == newnumber) newnumber = number.nextInt(rangeHigh - rangeLow) + rangeLow;
						rangeHigh = 0;
					}
					else
					{
						duplicate = newnumber;
						newnumber = number.nextInt(rangeHigh - rangeLow) + rangeLow;
						while (duplicate == newnumber) newnumber = number.nextInt(rangeHigh - rangeLow) + rangeLow;
					}					
				}			
			}	
			System.out.print("Is the number " + newnumber + "?");
			string = answer.nextLine();
			counter++;
		}
	}
}	

