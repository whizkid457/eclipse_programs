import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Number22
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Input File: ");
		String inputFileName = console.next();
		FileReader reader = new FileReader(inputFileName);
		Scanner in = new Scanner(reader);
		ArrayList<String> names = new ArrayList<String>();
		int answer = 0;
		System.out.println("Reading file . . . ");
		while (in.hasNextLine())
		{
			names.add(in.nextLine());
		}
		Collections.sort(names);
		int counter = 1;
		for (String word: names)
		{
			answer+=getNameValue(word, counter);
			counter++;
		}
		System.out.println("Answer: " + answer);
	}
	public static int getNameValue(String word, int counter)
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
		int product = sum * counter;
		System.out.println("Word: " + word + "\n Name Value: " + product);
		return product;
	}
}
