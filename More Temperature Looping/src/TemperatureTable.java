public class TemperatureTable
{
	public static void main(String[] args)
	{
		
		float x = 0;
		float C = 0; 
		
		while (x <= 10000)
		{
			C = ((x - 32) / 9) * 5;
			
			System.out.print(x);
			
			System.out.print(" degrees Farenheit = ");
			
			System.out.print(C);
			
			System.out.println(" degrees Celcius ");
			
			x = x + 1;
		}
	}
}
