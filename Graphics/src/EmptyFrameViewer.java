import javax.swing.JFrame;
public class EmptyFrameViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("An empty frame. JK Big LOL");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RectangleComponent c = new RectangleComponent();
		frame.add(c);
		frame.setVisible(true);
	}
}
