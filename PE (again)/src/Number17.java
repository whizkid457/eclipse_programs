import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Number17
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Input File: ");
		String inputFileName = console.next();
		FileReader reader = new FileReader(inputFileName);
		Scanner in = new Scanner(reader);
		int sum = 0;
		while (in.hasNextLine())
		{
			String line = in.nextLine();
			line = line.replaceAll("\\s+", "");
			sum+=line.length();
		}
		System.out.println("Answer: " + sum);
		in.close();
	}
}
