import java.util.Scanner;


public class IfStatement
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("What do you want h to equal?");
		int h = in.nextInt();
		
			if (h >= 1000000)
			{	
			System.out.println("Wow, that is a huge number!");
			}
			if (h < 1000000)
			{	
			System.out.println("That is a small number.");
			}
		
	}

}
