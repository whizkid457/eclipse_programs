public class Number6
{
	public static void main(String[] args)
	{
		long number = 1, sum_of_square = 0, square_of_sum = 0;
		System.out.println(square_of_sum(square_of_sum, number) - sum_of_square (sum_of_square, number));
	}
	public static long sum_of_square (long sum_of_square, long number)
	{
		while (number <= 100)
		{
			sum_of_square+= number * number;
			number++;
		}
		return sum_of_square;
	}
	public static long square_of_sum (long square_of_sum, long number)
	{
		while (number <= 100)
		{
			square_of_sum+=number;
			number++;
		}
		square_of_sum*=square_of_sum;	
		return square_of_sum;
	}

}
