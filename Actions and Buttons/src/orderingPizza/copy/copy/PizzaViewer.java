package orderingPizza.copy.copy;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class PizzaViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(2, 1));
		PizzaOrderer pizza = new PizzaOrderer();
		JPanel panel = pizza;
		frame.add(panel);
		GraphicPizza food = new GraphicPizza(pizza);
		frame.add(food);
		frame.setVisible(true);
		frame.setSize(500, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
