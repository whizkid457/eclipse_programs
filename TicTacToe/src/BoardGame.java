import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JLabel;
public class BoardGame extends JComponent
{
	public BoardGame()
	{
		
	}
	public void paintComponent(Graphics g)
	{
		final Graphics2D g2 = (Graphics2D) g;
		if (counter == 0)
		{	
			g2.drawString("Choose X or O", 250, 0);

			g2.setColor(Color.RED);
			g2.draw(new Line2D.Double(50, 100, 150, 450));
			g2.draw(new Line2D.Double(150, 100, 50, 450));
			
			g2.setColor(Color.BLUE);
			g2.draw(new Ellipse2D.Double(260, 100, 200, 350));
			
			class ClickListener implements MouseListener
			{
				public void mouseClicked(MouseEvent e)
				{
					int x = e.getX();
					int y = e.getY();
					choosePiece(x, y);
				}
				public void mouseEntered(MouseEvent arg0) {
				}
				public void mouseExited(MouseEvent arg0) {
				}
				public void mousePressed(MouseEvent arg0) {
				}
				public void mouseReleased(MouseEvent arg0) {
				}
			}
			MouseListener listener = new ClickListener();
			addMouseListener(listener);
		}
		else
		{
			//Draws the board
			g2.draw(new Line2D.Double(150, 50, 150, 450));
			g2.draw(new Line2D.Double(250, 50, 250, 450));
			g2.draw(new Line2D.Double(50, 175, 350, 175));
			g2.draw(new Line2D.Double(50, 300, 350, 300));
			
			class ClickListener implements MouseListener
			{
				public void mouseClicked(MouseEvent e)
				{
					int x = e.getX();
					int y = e.getY();
					switch (chooseSpace(x, y))
					{
						case 1: 
						{
							if (xIsTrue)
							{
								g2.draw(new Line2D.Double(75, 50, 125, 150));
								g2.draw(new Line2D.Double(125, 50, 75, 150));
							}
							else
								g2.draw(new Ellipse2D.Double(75, 50, 75, 75));
						}
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
					case 8:
					case 9:
					default:
					}
				}
				public void mouseEntered(MouseEvent arg0) {
				}
				public void mouseExited(MouseEvent arg0) {
				}
				public void mousePressed(MouseEvent arg0) {
				}
				public void mouseReleased(MouseEvent arg0) {
				}
			}
			MouseListener listener = new ClickListener();
			addMouseListener(listener);
		}
	}
	public int chooseSpace(int x, int y)
	{
		if (x <= 150 && y <= 175)
			return 1;
		else if (x > 150 && x <= 250 && y <= 175)
			return 2;
		else if (x > 250 && y <= 175)
			return 3;
		else if (x <= 150 && y > 175 && y <= 300)
			return 4;
		else if (x > 150 && x <= 250 && y > 175 && y <= 300)
			return 5;
		else if (x > 250 &&  y > 175 && y <= 300)
			return 6;
		else if (x <= 150 && y > 300)
			return 7;
		else if (x > 150 && y > 300)
			return 8;
		else if (x > 250 && y > 300)
			return 9;
		return 0;
		
	}
	public void choosePiece(int x, int y)
	{
		if (x >= 0 && x <= 250)
			xIsTrue = true;
		counter++;
		repaint();
	}
	private int counter;
	private boolean xIsTrue;
	private JLabel label;
}
