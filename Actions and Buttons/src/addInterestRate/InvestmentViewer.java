package addInterestRate;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class InvestmentViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JButton button = new JButton("Add Interest.");
		frame.setSize(100, 200);
		frame.add(button);
		ActionListener listener = new AddInterestListener();
		button.addActionListener(listener);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
