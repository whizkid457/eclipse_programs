import java.util.Scanner;
public class EC
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter how big: ");
		int n = in.nextInt();
		printHELLO(n);
	}
	public static void printHELLO(int n)
	{
		for (int r = 0; r < n; r++)
		{
			for (int c = 0; c < (5 * n) + 5; c++)
			{
				
			}
			System.out.println();
		}
	}
}
