package timer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent
{
	private Rectangle box;
	public RectangleComponent()
	{
		box = new Rectangle(100, 100, 20, 30);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(box);
	}
	
	public void moveBy(int dx, int dy)
	{
		box.translate(dx, dy);
		repaint();
	}
}
