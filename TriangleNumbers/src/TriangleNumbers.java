public class TriangleNumbers 
{
	public static void main(String[] args)
	{
		int i = 1;
		while (i <= 100)
		{
			System.out.println(i + ":" + (i * (i + 1))/2);
			i++;
		}
	}
}
