import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.Rectangle;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class RectangleComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Rectangle box = new Rectangle(5, 10, 15, 20);
		g2.draw(box);
		box.translate(15, 25);
		g2.draw(box);
		
		Ellipse2D.Double ellipse = new Ellipse2D.Double(100, 200, 34, 48);
		g2.draw(ellipse);
		ellipse = new Ellipse2D.Double(50, 45, 30, 30);
		g2.draw(ellipse);
		
		Line2D.Double segment = new Line2D.Double(13, 48, 84, 31);
		g2.draw(segment);
		
		Point2D.Double from = new Point2D.Double(51, 156);
		Point2D.Double to = new Point2D.Double(156, 150);
		segment = new Line2D.Double(from, to);
		g2.draw(segment);
		
		g2.drawString("Message", 45, 156);
		
		g2.setColor(Color.RED);
		g2.draw(segment);
		
		g2.fill(ellipse);
	}
}
