import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Copy
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++)
		{
			System.out.print("Enter a string: ");
			list.add(i, in.next());
		}
		for (int i = list.size() - 1; i >= 0; i--)
		{
			System.out.println(list.get(i));
		}
		
		
		
		int[] a = new int[10];
		for (int i = 0; i < 10; i++)
		{
			a[i] = new Random().nextInt(100) + 1;
		}
	}

}
