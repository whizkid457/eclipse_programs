import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WordFrame extends JFrame
{
	private JTextArea results;
	private JTextField field;
	private JLabel directions;
	private FileReader reader;
	private Scanner in;
	public WordFrame() throws FileNotFoundException
	{	
		setStatus();
		class WordListener implements KeyListener
		{
			public void keyReleased(KeyEvent e)
			{
				try {
					updateDictionary();
				} catch (FileNotFoundException e1) {
					System.exit(0);
				}
			}
			public void keyPressed(KeyEvent e) {	
			}
			public void keyTyped(KeyEvent e) {
			}	
		}
		KeyListener listener = new WordListener();
		field.addKeyListener(listener);
	}
	public void setStatus() throws FileNotFoundException
	{
		directions = new JLabel("Enter your word to look up");
		JPanel panel = new JPanel();
		
		results = new JTextArea(10, 30);
		results.setEditable(false);
		
		field = new JTextField(10);
		
		panel.add(directions);
		panel.add(field, BorderLayout.NORTH);
		panel.add(results, BorderLayout.CENTER);
		panel.setVisible(true);
		this.add(panel);
	}
	public void updateDictionary() throws FileNotFoundException
	{
		results.setText("");
		String inputFileName = "c:\\Sameet\\Dictionary.txt";
		reader = new FileReader(inputFileName);
		in = new Scanner(reader);
		while (in.hasNextLine())
		{	
			String line = in.nextLine().toLowerCase();
			String input = field.getText().toLowerCase();
			if (line.startsWith(input))
			{
				results.append(line + "\n");
			}
		}
	}
}