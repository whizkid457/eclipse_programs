import java.util.*;
public class RandomNum
{
	public static void main(String[] args)
	{
		Random num = new Random();
		while (true)
		{
			int random = num.nextInt(31) + 5;
			System.out.println(random);	
		}
	
	}	
}