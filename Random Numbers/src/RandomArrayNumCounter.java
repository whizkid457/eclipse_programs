import java.util.Random;
public class RandomArrayNumCounter
{
	public static void main(String args[])
	{
		Random num = new Random();
		int array[] = new int[25];
		for(int i = 0; i < 1000; i++)
		{
		   array[num.nextInt(25)]++;
		}
		for(int i = 0; i < 25; i++)
		{
		   System.out.println(i + " was generated " + array[i] + " times.");
		}
	} 
} 
