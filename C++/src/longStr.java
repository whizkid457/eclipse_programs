import java.util.Scanner;
public class longStr 
{
	public static void main(String[] args)
	{
		int max = 0;
		Scanner strings = new Scanner(System.in);
		System.out.println("Enter as many strings as you want, when you want to stop, type 'end'");
		String word = strings.next();
		String maxword = "";
		while (true)
		{
			if (word.equals("end")) break;
			int length = word.length();
			if (length > max)
			{
				max = length; 
				maxword = word;
			}
			word = strings.next();
		}
		System.out.println("Out of all of your inputs, '" + maxword + "' was the longest input entered, which is " + max + " letters long.");
	}
}
