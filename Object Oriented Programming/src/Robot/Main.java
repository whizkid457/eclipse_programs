package Robot;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("age?");
		int age = input.nextInt();
		System.out.println("power?");
		int power = input.nextInt();
		System.out.println("capacity?");
		int capacity = input.nextInt();
		
		Robot Sameet = new Robot(age, power, capacity);
		Sameet.turnOn();
		Sameet.displayAttributes();
		Sameet.turnOff();

	}

}
