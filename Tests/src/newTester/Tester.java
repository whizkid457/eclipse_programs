package newTester;

import java.math.BigInteger;

public class Tester
{
	public static void main(String[] args)
	{
		
		/*ArrayList<Integer> integer1 = new ArrayList<Integer>();
		int[] arr = new int[5];
		arr[0] = 5;
		integer1.add(5);
		new Object().change(integer1);
		System.out.println(arr[0]);*/
		System.out.println(accept("This string is awesome java"));
		
	}
	public static boolean accept(String text)
	{
		int keyLength = key.length();
		for (int i = 0; i < text.length() - (keyLength - 1); i++)
		{
			if (key.equals(text.substring(i, i + keyLength)))
				return true;
		}
		return false;
		//OR
		//return (text.indexOf(key) != -1);
	}
	public static String key = "java";
}
