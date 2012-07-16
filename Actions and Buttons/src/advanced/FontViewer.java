package advanced;

import javax.swing.JFrame;

public class FontViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new FontViewerFrame();
		frame.setTitle("This is advanced stuff.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 400);
		frame.setVisible(true);
	}

}
