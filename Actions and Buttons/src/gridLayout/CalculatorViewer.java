package gridLayout;
import javax.swing.JFrame;
public class CalculatorViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new Calculator();
		System.out.println("Calculator History.");
		frame.add(Calculator.panel);
		frame.setResizable(false);
		frame.setTitle("Made by me.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 200);
		frame.setVisible(true);
	}
}
