import javax.swing.JFrame;
public class Frame
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.add(new BoardGame());
		frame.setResizable(false);
		frame.setSize(500, 500);
		frame.setLocation(500, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
