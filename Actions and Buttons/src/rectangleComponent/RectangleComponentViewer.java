package rectangleComponent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class RectangleComponentViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		final RectangleComponent component = new RectangleComponent();
		
		class MousePressListener implements MouseListener
		{
			public void mousePressed(MouseEvent event)
			{
				int x = event.getX();
				int y = event.getY();
				component.moveTo(x, y);
			}
			public void mouseReleased(MouseEvent event)
			{
				System.out.println("Mouse was released.");
			}
			public void mouseClicked(MouseEvent event)
			{
				System.out.println("Mouse was clicked.");
			}
			public void mouseEntered(MouseEvent event)
			{
				int x = event.getX();
				int y = event.getY();
				component.moveTo(x, y);
			}
			public void mouseExited(MouseEvent event)
			{
				System.out.println("Mouse was exited.");
			}
		}
		
		MouseListener listener = new MousePressListener();
		component.addMouseListener(listener);
		frame.add(component);
	}
}
