package orderingPizza.copy.copy;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class GraphicPizza extends JComponent
{
	private boolean small, medium, large, pepporoni, cheese, vegetables, chicken, breadsticks, sauce, wings;
	private PizzaOrderer pizza;
	public GraphicPizza(PizzaOrderer original)
	{
		pizza = original;
	}
	public void paintComponent(Graphics g)
	{
		if (pizza.small.isSelected()) small = true;
		/*if (pizza.medium.isSelected()) medium = true;
		if (pizza.large.isSelected()) large = true;
		if (pizza.pepporoni.isSelected()) pepporoni = true;
		if (pizza.cheese.isSelected()) cheese = true;
		if (pizza.vegetables.isSelected()) vegetables = true;
		if (pizza.chicken.isSelected()) chicken = true;
		if (pizza.breadsticks.isSelected()) breadsticks = true;
		if (pizza.sauce.isSelected()) sauce = true;
		if (pizza.wings.isSelected()) wings = true;
		*/
		Graphics2D g2 = (Graphics2D) g;
		if (small)
		{
			g2.drawString("IT WORKS!!!!", 400, 500);
		}
		else
			g2.drawString("OMG", 400, 500);
	}
}
