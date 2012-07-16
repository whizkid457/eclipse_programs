import java.util.ArrayList;
import java.util.Scanner;
public class PermutationGeneratorDemo
{
	public static void main(String[] args)
	{
		int counter = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string: ");
		String user = input.nextLine();
		PermutationGenerator generator = new PermutationGenerator(user);
		ArrayList<String> permutations = generator.getPermutations();
		for (String s : permutations)
		{
			System.out.println(s + " counter: " + counter);
			counter++;
		}
	}

}
