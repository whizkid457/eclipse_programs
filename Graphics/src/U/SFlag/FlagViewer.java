package U.SFlag;


import javax.swing.JFrame;

public class FlagViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("The U.S Flag.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlagComponent fc = new FlagComponent();
		frame.add(fc);
		
		frame.setVisible(true);
	}

}
