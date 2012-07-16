package U.SFlag;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

public class Flag
{
	public Flag() 
	{
	}
	public void draw(Graphics2D g2)
	{
		//Title
		g2.setColor(Color.RED);
		g2.drawString("The U.S Flag.", 107, 45);
		
		//Flag base and Star base
		g2.setColor(Color.BLACK);
		Rectangle base = new Rectangle(50, 50, 200, 100);
		g2.draw(base);
		Rectangle starBase = new Rectangle(50, 50, 75, 40);
		g2.setColor(Color.BLUE);
		g2.fill(starBase);
		
		//Red Strips
		Rectangle redStrip = new Rectangle(126, 50, 124, 20);
		g2.setColor(Color.RED);
		g2.fill(redStrip);
		redStrip = new Rectangle(51, 91, 199, 20);
		g2.fill(redStrip);
		redStrip = new Rectangle(51, 130, 199, 20);
		g2.fill(redStrip);
		
		//Stars
		g2.setColor(Color.WHITE);
		int x = 52;
		int y = 55;
		for (int j = 1; j <= 5; j++)
		{
			for (int i = 1; i <= 10; i++)
			{
				Line2D.Double line = new Line2D.Double(x, y, x+2, y-3);
				g2.draw(line);
				Line2D.Double line1 = new Line2D.Double(x+2, y-3, x+5, y);
				g2.draw(line1);
				x+=7;
			}
			y+=7;
			x = 52;
		}
		
		//Credits
		g2.setColor(Color.BLUE);
		g2.drawString("Created by: Sameet Sapra", 50, 165);
		g2.drawString("Grade 9", 50, 180);
		g2.drawString("Neuqua Valley High School", 50, 195);
		
		
	}
}
