import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
public class Graph extends JComponent
{
	private double slope;
	private double yintercept;
	public Graph(double slope, double yintercept)
	{
		this.slope = slope;
		this.yintercept = yintercept;
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D)g;
		double h = this.getHeight();
		double w = this.getWidth();
		g2.draw(new Line2D.Double(w/2, 0.0, w/2, h));
		g2.draw(new Line2D.Double(0.0, h/2, w, h/2));
		
		//drawing lines
		for (int i = 0; i < h; i+=5)
		{
			g2.draw(new Line2D.Double(w/2 - 4, i, w/2 + 4, i));
		}
		for (int i = 0; i < w; i+=5)
		{
			g2.draw(new Line2D.Double(i, h/2 - 4, i, h/2 + 4));
		}
		
		double centerX = w/2;
		g2.setColor(Color.red);
		g2.draw(new Ellipse2D.Double(centerX, 5 * (h/2 - yintercept), centerX, 5 * (h/2 - yintercept)));
		for (int x = -300; x < 300; x++)
		{
			g2.draw(new Line2D.Double(centerX + x, w/2 - slope * x + yintercept, centerX + x, h/2 - slope * x + yintercept));
		}
		g2.setColor(Color.black);
		g2.drawString("y = " + slope + "x + " + yintercept, 20, 20);
	}
}
