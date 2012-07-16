package orderingPizza.copy;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class GraphicPizza extends JComponent
{
	public void paintComponent(Graphics g)
	{
		System.out.println("Testing");
		Graphics2D g2 = (Graphics2D) g;
		g2.drawString("Testing", 400, 500);
	}
}
