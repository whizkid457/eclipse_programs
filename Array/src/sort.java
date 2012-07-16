import java.util.Scanner;
public class sort
{
	public static void main(String[] args)
	{
		int numbers[] = new int [4];		
		getArray(numbers);
		sortArray(numbers);
		displayArray(numbers);
	}
	public static int indexMin (int numbers[], int low, int high)
	{
		int minInd;
		minInd = low;
		for (int i = low; i <= high; i++)
		{
			if (numbers[i] > numbers[minInd]) //whether it is less than or greater than
			{
				minInd = i;
			}
		}
		return minInd;
	}
	public static void swap (int numbers[], int loc1, int loc2)
	{
		int temp;
		temp = numbers[loc1];
		numbers[loc1] = numbers[loc2];
		numbers[loc2] = temp;
	}
	public static void sortArray (int numbers[])
	{
		int three = 3;
		for (int i = 0; i < 4; i++)
		{
			int minInd = indexMin (numbers, i, three);
			swap (numbers, i , minInd);
		}
	}
	public static void displayArray(int numbers[])
	{
		System.out.println("The sorted list from top to bottom is: ");
		for (int i = 0; i < 4; i++)
		{
			System.out.println(numbers[i]);
		}
		System.out.println("The biggest number entered by the user is " + numbers[0]);
	}
	public static void getArray (int numbers[])
	{
		System.out.println("This program sorts four numbers entered by the user.\n");
		try
		{
			for (int i = 0; i < 4; i++)
			{
				Scanner answer = new Scanner(System.in);
				System.out.print("Enter next integer: ");
				numbers [i] = answer.nextInt();
			}
		} catch (NumberFormatException nfe)
		{
			System.out.println("That character is not a number!");
		} catch (ArithmeticException ae)
		{
			System.out.println("That character is not a number!");
		}
		
		
	}
	
}
