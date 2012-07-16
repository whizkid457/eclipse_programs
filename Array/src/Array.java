import java.util.*;
public class Array
{
	public static void main(String[] args)
	{
		int arrayname [] = new int [5];
		int array [] = {3,6,4,8,2};
		arrayname [0] = 104;
		array [4] = 104;
		int c = 15;
		System.out.println(array[4]);
		System.out.println(arrayname[0]);
		ArrayList<Integer> names = new ArrayList<Integer>();
		names.add(5);
		names.add(3);
		names.add(c);
		names.remove(0);
		int length = names.size();
		System.out.println(length);
		System.out.println(names);
	}
}
