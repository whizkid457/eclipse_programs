import java.util.Random;
public class RandomArrayNum
{
	public static void main(String[] args)
	{
		Random num = new Random();
		int array[] = new int[20];
		for (int i = 0; i < 20; i++)
		{	
			array[i] = num.nextInt(20);
			System.out.print(array[i] + " ");
		}
	}

}
