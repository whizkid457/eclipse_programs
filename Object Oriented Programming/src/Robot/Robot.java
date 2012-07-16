package Robot;

public class Robot 
{	
	int robotAge;
	int robotPower;
	int robotCapacity;
	Robot(int age, int power, int capacity)
	{
		robotAge = age;
		robotPower = power;
		robotCapacity = capacity;
	}
	public void turnOn()
	{
		System.out.println("Robot has turned on.\n Hello user. You have turned me on.");
	}
	public void turnOff()
	{
		System.out.println("Thank you for using me. \nRobot has turned off.");
	}
	public void displayAttributes()
	{
		System.out.println("Age: " + robotAge);
		System.out.println("Power: " + robotPower);
		System.out.println("Capacity: " + robotCapacity);
	}

}
