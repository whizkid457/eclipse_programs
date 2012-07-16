package advanced;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class FontViewerFrame extends JFrame
{
	private JLabel sampleField;
	private JCheckBox italicCheckBox;
	private JCheckBox boldCheckBox;
	private JRadioButton smallButton;
	private JRadioButton mediumButton;
	private JRadioButton largeButton;
	private JComboBox facenameCombo;
	private ActionListener listener;
	
	public FontViewerFrame()
	{
		sampleField = new JLabel("Sameet");
		this.add(sampleField, BorderLayout.CENTER);
		
		//Shared among all components
		class ChoiceListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				setSampleFont();
			}
		}
		
		listener = new ChoiceListener();
		
		createControlPanel();
		setSampleFont();
		setSize(300, 400);
	}
	public void createControlPanel()
	{
		JPanel facenamePanel = createComboBox();
		JPanel sizeGroupPanel = createCheckBoxes();
		JPanel styleGroupPanel = createRadioButtons();
		
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(3, 1));
		controlPanel.add(facenamePanel);
		controlPanel.add(sizeGroupPanel);
		controlPanel.add(styleGroupPanel);
		
		this.add(controlPanel, BorderLayout.SOUTH);
	}
	public JPanel createComboBox()
	{
		facenameCombo = new JComboBox();
		facenameCombo.addItem("Serif");
		facenameCombo.addItem("SansSerif");
		facenameCombo.addItem("Monospaced");
		facenameCombo.setEditable(false);
		
		facenameCombo.addActionListener(listener);
		
		JPanel panel = new JPanel();
		panel.add(facenameCombo);
		return panel;
	}
	public JPanel createCheckBoxes()
	{
		italicCheckBox = new JCheckBox("Italic");
		italicCheckBox.addActionListener(listener);
		
		boldCheckBox = new JCheckBox("Bold");
		boldCheckBox.addActionListener(listener);
		
		JPanel panel = new JPanel();
		panel.add(italicCheckBox);
		panel.add(boldCheckBox);
		panel.setBorder(new TitledBorder(new EtchedBorder(), "Style"));
		return panel;
	}
	public JPanel createRadioButtons()
	{
		smallButton = new JRadioButton("Small");
		smallButton.addActionListener(listener);
		
		mediumButton = new JRadioButton("Medium");
		mediumButton.addActionListener(listener);
		mediumButton.setSelected(true);
		
		largeButton = new JRadioButton("Large");
		largeButton.addActionListener(listener);
		
		ButtonGroup group = new ButtonGroup();
		group.add(smallButton);
		group.add(mediumButton);
		group.add(largeButton);
		
		JPanel panel = new JPanel();
		panel.add(smallButton);
		panel.add(mediumButton);
		panel.add(largeButton);
		panel.setBorder(new TitledBorder(new EtchedBorder(), "Size"));
		return panel;
	}
	public void setSampleFont()
	{
		//Font name (from combo box)
		String facename = (String) facenameCombo.getSelectedItem();
		
		//Font style (from checks box)
		int style = 0;
		if (italicCheckBox.isSelected()) style += Font.ITALIC;
		else if (boldCheckBox.isSelected()) style += Font.BOLD;
		
		//Font size (From radio buttons)
		int size = 0;
		if (smallButton.isSelected()) size = 14;
		else if (mediumButton.isSelected()) size = 44;
		else if (largeButton.isSelected()) size = 99;
		
		sampleField.setFont(new Font(facename, style, size));
		sampleField.repaint();
	}
}
