package orderingPizza;

import javax.swing.JFrame;
public class PizzaViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new PizzaOrderer();
		frame.add(new GraphicPizza());
		frame.setVisible(true);
		frame.setSize(400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
