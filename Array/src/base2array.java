public class base2array
{
	public static void main(String[] args)
	{
		int maxpow = 6, i = 0;
		int [] max = new int[6];
		while (i < maxpow)
		{
			System.out.print("2^" + i + " ");
			i++;
		}
		i = 0;
		System.out.println("");
		while (i < maxpow)
		{
			max[i] = (int) Math.pow(2,i);
			System.out.print(" " + max[i] + "  ");
			i++;
		}
		i = 0;
		System.out.println("");
		while (i < maxpow)
		{
			System.out.print(" " + i + "  ");
			i++;
		}
	}
}
