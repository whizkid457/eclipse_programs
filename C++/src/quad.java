import java.util.Scanner;
public class quad
{
	public static void main(String[] args)
	{
		Scanner quad = new Scanner(System.in);
		System.out.println("Enter a,b,c for the quadratic equation: ");
		String a = quad.next();
		String b = quad.next();
		String c = quad.next();
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int c1 = Integer.parseInt(c);
		double sqrt = b1 * b1 -4 * a1 * c1;
		int plusans = (int) ((-b1 + Math.sqrt(sqrt))/2 * a1);
		int negans = (int) ((-b1 - Math.sqrt(sqrt))/2 * a1);
		if (plusans == negans) System.out.println("x = " + plusans); 
		else System.out.println("x = " + plusans + " and " + negans);
	}

}
