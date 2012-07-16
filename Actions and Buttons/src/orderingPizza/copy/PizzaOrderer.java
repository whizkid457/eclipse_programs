package orderingPizza.copy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class PizzaOrderer extends JPanel
{
	public JTextField label;
	public JCheckBox pepporoni;
	public JCheckBox cheese;
	public JCheckBox vegetables;
	public JCheckBox chicken;
	public JCheckBox breadsticks;
	public JCheckBox wings;
	public JCheckBox sauce;
	public JRadioButton small;
	public JRadioButton medium;
	public JRadioButton large;
	public ActionListener listener;
	public JLabel directions;
	public JLabel price;
	public PizzaOrderer()
	{
		directions = new JLabel("Directions:  " + "Create your pizza.");
				
		add(directions, BorderLayout.NORTH);
		label = new JTextField("Your price will be displayed here.");
		add(label, BorderLayout.PAGE_END);
		class ChoiceListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				setNewPrice();
				repaint();
			}
		}
		listener = new ChoiceListener();
		createControlPanel();
	}
	public void createControlPanel()
	{
		JPanel sizePanel = createSizePanel();
		JPanel toppingPanel = createToppingPanel();
		JPanel sidePanel = createSidePanel();
		
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(3, 1));
		controlPanel.add(sizePanel);
		controlPanel.add(toppingPanel);
		controlPanel.add(sidePanel);
		//controlPanel.add(pizzaPicture);
		add(controlPanel, BorderLayout.EAST);
	}
	public JPanel createSizePanel()
	{
		small = new JRadioButton("Small ($3 Dollars)");
		small.addActionListener(listener);
		
		medium = new JRadioButton("Medium ($4 Dollars)");
		medium.addActionListener(listener);
		
		large = new JRadioButton("Large ($5 Dollars)");
		large.addActionListener(listener);
		
		ButtonGroup group = new ButtonGroup();
		group.add(small);
		group.add(medium);
		group.add(large);
		
		JPanel panel = new JPanel();
		panel.add(small);
		panel.add(medium);
		panel.add(large);
		panel.setBorder(new TitledBorder(new EtchedBorder(), "Size"));
		return panel;
	}
	public JPanel createToppingPanel()
	{
		pepporoni = new JCheckBox("Pepporoni");
		cheese = new JCheckBox("Cheese");
		vegetables = new JCheckBox("Vegetables");
		chicken = new JCheckBox("Chicken");
		
		pepporoni.addActionListener(listener);
		cheese.addActionListener(listener);
		vegetables.addActionListener(listener);
		chicken.addActionListener(listener);
		
		JPanel panel = new JPanel();
		panel.add(pepporoni);
		panel.add(cheese);
		panel.add(vegetables);
		panel.add(chicken);
		panel.setBorder(new TitledBorder(new EtchedBorder(), "Toppings (50 Cents Each) "));
		return panel;
	}
	public JPanel createSidePanel()
	{
		breadsticks = new JCheckBox("Bread sticks");
		wings = new JCheckBox("Wings");
		sauce = new JCheckBox("Sauce");
		
		breadsticks.addActionListener(listener);
		wings.addActionListener(listener);
		sauce.addActionListener(listener);
		
		JPanel panel = new JPanel();
		panel.add(breadsticks);
		panel.add(wings);
		panel.add(sauce);
		panel.setBorder(new TitledBorder(new EtchedBorder(), "Sides (50 Cents Each)"));
		return panel;
	}
	public void setNewPrice()
	{
		double sizePrice = 0;
		if (small.isSelected()) sizePrice += 3;
		else if (medium.isSelected()) sizePrice += 4;
		else if (large.isSelected()) sizePrice += 5;
		
		double toppingPrice = 0;
		
		if (pepporoni.isSelected()) toppingPrice += 0.5;
		if (cheese.isSelected()) toppingPrice += 0.5;
		if (vegetables.isSelected()) toppingPrice += 0.5;
		if (chicken.isSelected()) toppingPrice += 0.5;
		
		double sidePrice = 0;

		if (breadsticks.isSelected()) sidePrice += 1;
		if (wings.isSelected()) sidePrice += 1.5;
		if (sauce.isSelected()) sidePrice += 0.5;
		
		double total = sizePrice + toppingPrice + sidePrice;
		label.setText("The cost is " + total + " dollars.");
	}
}
