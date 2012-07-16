import java.util.Scanner;
public class volumes
{
	public static void main(String[] args)
	{
		 Scanner one = new Scanner(System.in);
		 System.out.println("Which shape would you like this program to compute the volume of: a cube, a cylinder, or a box?");
		 String choice = one.next();
		 if (choice.equals("cube"))
		 {
			Scanner two = new Scanner(System.in);	  
			System.out.print("Side of the cube: ");
			String side = two.next();
		   	int side1 = Integer.parseInt(side);
		   	int cube = side1 * side1 * side1;
		   	System.out.println("The volume of a cube with a side length of " + side + " is " + cube);
		 }	
		 if (choice.equals("cylinder"))
		 {
			 Scanner three = new Scanner(System.in);	 
			 System.out.print("Radius of the cylinder: ");
			 String radius = three.next();
			 int radius1 = Integer.parseInt(radius);
			 Scanner four = new Scanner(System.in);
			 System.out.print("Height of the cylinder: ");
			 String height = four.next();
			 int height1 = Integer.parseInt(height);
			 int cylinder = (int) (3.14 * (radius1 * radius1) * height1);
			 System.out.println("The volume of a cylinder with a radius of " + radius + " and a height of " + height1 + " is " + cylinder);
		 } 
		 if (choice.equals("box"))
		 {
			 Scanner five = new Scanner(System.in);	 
			 System.out.print("First side length of the box: ");
			 String side2 = five.next();
			 int side3 = Integer.parseInt(side2);
			 Scanner six = new Scanner(System.in);
			 System.out.print("Second side length of the box: ");
			 String side4 = six.next();
			 int side5 = Integer.parseInt(side4);
			 Scanner seven = new Scanner(System.in);
			 System.out.print("Height of the box: ");
			 String height2 = seven.next();
			 int height3 = Integer.parseInt(height2);
			 int box = side3 * side5 * height3;
			 System.out.println("The volume of a box with side lengths " + side2 + " and " + side4 + " and a height of " + height2 + " is " + box);                   
		 }
	}                
}

