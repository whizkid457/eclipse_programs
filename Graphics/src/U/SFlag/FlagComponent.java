package U.SFlag;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class FlagComponent extends JComponent
{
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Flag f = new Flag();
		f.draw(g2);
	}
}
