import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Fileinput
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input File: ");
		String inputFileName = in.next();
		System.out.println("Output File: ");
		String outputFileName = in.next();
		FileReader reader = new FileReader(inputFileName);
		Scanner console = new Scanner(reader);
		PrintWriter out = new PrintWriter(outputFileName);
		int lineNumber = 1;
		while (console.hasNextLine())
		{
			String line = in.nextLine();
			out.println("/* " + lineNumber + " */ " + line);
			lineNumber++;
		}
		System.out.println("File copied. ");
		out.close();
	}
}
