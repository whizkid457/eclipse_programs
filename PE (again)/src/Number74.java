public class Number74
{
	public static void main(String[] args)
	{
		int number = 3, origNum = 3, countLoops = 0, counter = 0, answerCounter = 0;
		while (origNum < 1000000)
		{
			if (countLoops == 0) origNum = number;
			switch(Integer.toString(number).length())
			{
				case 1:
				{
					number = one(number);
					if (number == 69 || number == 871 || number == 872)
					{
						origNum++;
						countLoops = 0;
						counter = 0;
						break; 
					}
					else
					{
						counter++;
						if (counter == 60) answerCounter++;
					}
				}
				case 2:
				{
					number = two(number);
					if (number == 69 || number == 871 || number == 872)
					{
						origNum++;
						countLoops = 0;
						counter = 0;
						break; 
					}
					else
					{
						counter++;
						if (counter == 60) answerCounter++;
					}
				}
				case 3: 
				{
					number = three(number);
					if (number == 69 || number == 871 || number == 872)
					{
						origNum++;
						countLoops = 0;
						counter = 0;
						break;
					}
					else	
					{
						counter++;
						if (counter == 60) answerCounter++;
					}
				}
				case 4:
				{
					number = four(number);
					if (number == 69 || number == 871 || number == 872)
					{	
						origNum++;
						countLoops = 0;
						counter = 0;
						break;
					}
					else
					{
						counter++;
						if (counter == 60) answerCounter++;
					}
				}
				case 5:
				{	
					number = five(number); 
					if (number == 69 || number == 871 || number == 872)
					{
						origNum++;
						countLoops = 0;
						counter = 0;
						break;
					}
					else
					{
						counter++;
						if (counter == 60) answerCounter++;
					}
				}
				case 6:
				{
					number = six(number);
					if (number == 69 || number == 871 || number == 872)
					{	
						origNum++;
						countLoops = 0;
						counter = 0;
						break;
					}
					else
					{
						counter++;
						if (counter == 60) answerCounter++;
					}	
				}
			}
		}
		System.out.println("Answer: " + answerCounter);
	}
	private static int six(int number)
	{
		int a = 1, b = 1, c = 1, d = 1, e = 1, f = 1;
		int one = Integer.parseInt(Integer.toString(number).substring(0, 1));
		for (a = 1; one != 0; one--) a*=one; 
		int two = Integer.parseInt(Integer.toString(number).substring(1, 2));
		for (b = 1; two != 0; two--) b*=two; 
		int three = Integer.parseInt(Integer.toString(number).substring(2, 3));
		for (c = 1; three != 0; three--) c*=three; 
		int four = Integer.parseInt(Integer.toString(number).substring(3, 4));
		for (d = 1; four != 0; four--) d*=four; 
		int five = Integer.parseInt(Integer.toString(number).substring(4, 5));
		for (e = 1; five != 0; five--) e*=five; 
		int six = Integer.parseInt(Integer.toString(number).substring(5, 6));
		for (f = 1; six != 0; six--) f*=six; 
		return a + b + c + d + e + f;
	}
	private static int five(int number)
	{
		int a = 1, b = 1, c = 1, d = 1, e = 1;
		int one = Integer.parseInt(Integer.toString(number).substring(0, 1));
		for (a = 1; one != 0; one--) a*=one; 
		int two = Integer.parseInt(Integer.toString(number).substring(1, 2));
		for (b = 1; two != 0; two--) b*=two; 
		int three = Integer.parseInt(Integer.toString(number).substring(2, 3));
		for (c = 1; three != 0; three--) c*=three; 
		int four = Integer.parseInt(Integer.toString(number).substring(3, 4));
		for (d = 1; four != 0; four--) d*=four; 
		int five = Integer.parseInt(Integer.toString(number).substring(4, 5));
		for (e = 1; five != 0; five--) e*=five; 
		return a + b + c + d + e;
	}
	private static int four(int number)
	{
		int a = 1, b = 1, c = 1, d = 1;
		int one = Integer.parseInt(Integer.toString(number).substring(0, 1));
		for (a = 1; one != 0; one--) a*=one; 
		int two = Integer.parseInt(Integer.toString(number).substring(1, 2));
		for (b = 1; two != 0; two--) b*=two; 
		int three = Integer.parseInt(Integer.toString(number).substring(2, 3));
		for (c = 1; three != 0; three--) c*=three; 
		int four = Integer.parseInt(Integer.toString(number).substring(3, 4));
		for (d = 1; four != 0; four--) d*=four; 
		return a + b + c + d;
	}
	private static int three(int number)
	{
		int a = 1, b = 1, c = 1;
		int one = Integer.parseInt(Integer.toString(number).substring(0, 1));
		for (a = 1; one != 0; one--) a*=one; 
		int two = Integer.parseInt(Integer.toString(number).substring(1, 2));
		for (b = 1; two != 0; two--) b*=two; 
		int three = Integer.parseInt(Integer.toString(number).substring(2, 3));
		for (c = 1; three != 0; three--) c*=three; 
		return a + b + c;
	}
	private static int two(int number)
	{
		int a = 1, b = 1;
		int one = Integer.parseInt(Integer.toString(number).substring(0, 1));
		for (a = 1; one != 0; one--) a*=one; 
		int two = Integer.parseInt(Integer.toString(number).substring(1, 2));
		for (b = 1; two != 0; two--) b*=two; 
		return a + b;
	}
	private static int one(int number)
	{
		int a = 1;
		int one = Integer.parseInt(Integer.toString(number).substring(0, 1));
		for (a = 1; one != 0; one--) a*=one; 
		return a;
	}

}
