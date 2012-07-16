import java.util.Scanner;
public class Analyzer
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two strings: ");
		String a = in.next();
		String b = in.next();
		if (a.compareTo(b) < 0) System.out.println(a + " comes before " + b);
		else if (a.compareTo(b) == 0) System.out.println("They're the same");
		else System.out.println(b + " comes before " + a);
	}
}
