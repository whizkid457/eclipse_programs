public class Tester
{
	public static void main(String[] args)
	{
		//loopingThroughStrings();
		//intVsDouble();
		
		String s1 = "ab";
		String s2 = s1;
		s1 = s1 + "c";
		System.out.println(s1 + " " + s2);
		
		Comparable<MyObject> mo = new Test();
		System.out.println(mo.compareTo(new MyObject()));
	}
	private static void intVsDouble()
	{
		System.out.println("\t\t Integer Vs Double\n\n");
		double a = 3/5; // a is 0.0
		double b = (double) (3/5); // b is 0.0
		double c = (double) 3/5; //c is 0.6
		double d = 3.0/5; //d is 0.6
		// int e = (double) 3/5; SYNTAX ERROR  
		System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n\n\n\n");
	}
	public static void loopingThroughStrings()
	{
		System.out.println("\t\t Looping Through Strings\n\n");
		String str = "adflsajavabadhdfjava";
		String key = "java";
		int counter = 0;
		for (int i = 0; i < str.length() - 3; i++)
		{
			if (str.substring(i, i + 4).equals(key))
				counter++;
		}
		System.out.println(key + " appeared " + counter + " times in " + str);
	}
}
