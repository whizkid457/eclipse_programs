package orderingPizza.copy;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class PizzaViewer
{
	public static void main(String[] args)
	{
		JPanel panel = new PizzaOrderer();
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
