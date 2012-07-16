package baseConverterClass;
import java.util.Scanner;
public class Tester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		BaseConverter bc = new BaseConverter(in.nextInt());
		
		System.out.print("Starting Base: ");
		int startingBase = in.nextInt();
		
		System.out.print("Ending Base: ");
		int endingBase = in.nextInt();
		
		//Starting has ten
		if (startingBase == 10)
		{
			System.out.println("Base " + endingBase + ": " + bc.toBaseX(endingBase));
			System.exit(0);
		}
		
		//Ending has ten
		if (endingBase == 10)
		{
			System.out.println("Base " + endingBase + ": " + bc.toBase10(startingBase));
			System.exit(0);
		}
		
		//Neither have 10
		bc.toBase10(startingBase);
		System.out.println("Base " + endingBase + ": " + bc.toBaseX(endingBase));
	}
}
