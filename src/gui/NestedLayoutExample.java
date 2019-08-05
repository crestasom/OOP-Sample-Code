package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NestedLayoutExample extends JFrame {
	JPanel leftPanel, rightPanel;
	JLabel label1, label2, label3;
	JTextField name, email, phone;
	JButton b1, b2, b3, b4;

	public NestedLayoutExample(String title) {
		super(title);
		initializeAll();
		setLayout(new GridLayout(1, 2));
		leftPanel = new JPanel();
		leftPanel.setBackground(Color.RED);
		rightPanel = new JPanel();
		rightPanel.setBackground(Color.BLUE);
		rightPanel.setLayout(new GridLayout(2, 2));
		add(leftPanel);
		add(rightPanel);

		leftPanel.add(label1);
		leftPanel.add(name);
		leftPanel.add(label2);
		leftPanel.add(email);
		leftPanel.add(label3);
		leftPanel.add(phone);

		rightPanel.add(b1);
		rightPanel.add(b2);
		rightPanel.add(b3);
		rightPanel.add(b4);

		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public void initializeAll() {
		label1 = new JLabel("Name");
		label2 = new JLabel("Email");
		label3 = new JLabel("Phone");
		name = new JTextField(25);
		email = new JTextField(25);
		phone = new JTextField(25);
		b1 = new JButton("Add");
		b2 = new JButton("Edit");
		b3 = new JButton("Update");
		b4 = new JButton("Delete");

	}

	public static void main(String[] args) {
		new NestedLayoutExample("Nested Layout Example");
	}
}
