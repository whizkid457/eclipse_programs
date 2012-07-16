import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Number42
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Enter input file: ");
		String inputFileName = console.next();
		FileReader reader = new FileReader(inputFileName);
		Scanner in = new Scanner(reader);
		System.out.println("Reading file . . .");
		int counter = 0;
		while (in.hasNextLine())
		{
			String word = in.nextLine();
			int number = getNameValue(word);
			System.out.println("Word: " + word + " Number: " + number);
			if (checkTriangleNumber(number, word))
			{
				counter++;
			}
		}
		System.out.println("Answer: " + counter);
		in.close();
	}
	public static boolean checkTriangleNumber(int number, String word)
	{
		for (int i = 1; i * (i + 1)/2 <=  number; i++)
		{
			if (i * (i + 1)/2 == number)
			{
				//System.out.println("Word: " + word + "Number: " + number);
				return true;
			}
		}
		return false;
	}
	public static int getNameValue(String word)
	{
		if (word == null || word.trim().length() == 0)
		{
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < word.length(); i++)
		{
			int charValue = word.charAt(i);
			charValue -= 'A';
			sum += charValue + 1;
		}
		return sum;
	}
}
