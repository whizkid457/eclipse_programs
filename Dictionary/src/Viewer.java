import java.io.FileNotFoundException;
import javax.swing.JFrame;

public class Viewer
{
	public static void main(String[] args) throws FileNotFoundException
	{
		JFrame f = new WordFrame();
		f.setTitle("Personal Dictionary");
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
