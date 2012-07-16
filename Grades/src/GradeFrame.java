import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GradeFrame extends JFrame
{
	private JTextField field;
	private JTextField percent;
	private JComboBox combo;
	private JButton button;
	private ActionListener listener;
	private ActionListener buttonListener;
	
	public GradeFrame()
	{
		class ChoiceListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				setGrades();
			}
		}
		button = new JButton("Add subcategory.");
		button.setSize(100, 200);
		add(button, BorderLayout.EAST);
		class ButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				percent = new JTextField(BorderLayout.CENTER);
				percent.setText("Enter percent of one of your sub grades");
				String txt = percent.getText();
				double percent = Double.parseDouble(txt);
			}
		}
		buttonListener = new ButtonListener();
		listener = new ChoiceListener();
		
		createPanels();
		
		field = new JTextField(10);
		field.setEditable(false);
		add(field, BorderLayout.SOUTH);
	}
	public void setGrades()
	{
		String choice = (String) combo.getSelectedItem();
		field.setText(choice);
	}
	public JPanel createComboBox()
	{
		combo = new JComboBox();
		combo.addItem("Math");
		combo.addItem("Spanish");
		combo.addItem("English");
		combo.addItem("Science");
		combo.addItem("Gym");
		combo.addItem("History");
		combo.addItem("AP Computer Science");
		
		combo.setEditable(false);
		combo.addActionListener(listener);
		
		JPanel panel = new JPanel();
		panel.add(combo);
		return panel;
	}
	public void createPanels()
	{
		JPanel panel = createComboBox();
		add(panel);
	}
}
