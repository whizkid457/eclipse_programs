import javax.swing.JFrame;

import java.awt.Color;
import java.util.Scanner;
public class Grapher
{
	public static void main(String[] args)
	{
		System.out.println("Enter slope, and y-intercept: ");
		double slope = new Scanner(System.in).nextDouble();
		double y = new Scanner(System.in).nextDouble();
		JFrame frame = new JFrame();
		Graph g = new Graph(slope, y);
		frame.add(g);
		frame.setSize(600, 600);
		frame.setLocation(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
