package gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TestLayout extends JFrame {
	JPanel leftPanel, rightPanel, p1, p2, p3;

	public static void main(String[] args) {
		new TestLayout();
	}

	public TestLayout() {
		setLayout(new GridLayout(1, 0));
		leftPanel = new JPanel();
		rightPanel = new JPanel();
		leftPanel.setBackground(Color.BLACK);
		rightPanel.setBackground(Color.GREEN);

		add(leftPanel);
		add(rightPanel);
		setUpLeftPanel();
		setUpRightPanel();
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void setUpRightPanel() {
		rightPanel.setLayout(new GridLayout(3, 1));
		p1 = new JPanel();
		p1.setLayout(new GridLayout(0, 2));
		p1.add(new JLabel("First Name"));
		p1.add(new JTextField(10));
		p1.add(new JLabel("Last Name"));
		p1.add(new JTextField(10));
		p1.add(new JLabel("Phone"));
		p1.add(new JTextField(10));
		p1.add(new JCheckBox("Private"));

		JRadioButton b1, b2;
		ButtonGroup bg = new ButtonGroup();

		b1 = createRadioButton(true, false, "Forename,Surname");
		b2 = createRadioButton(false, true, "Surname,Forename");
		b2 = new JRadioButton("Surname,Forename");
		bg.add(b1);
		bg.add(b2);
		p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
		p2.add(new JPanel());
		p2.add(b1);
		p2.add(new JPanel());
		p2.add(b2);
		p2.add(new JPanel());
		p3 = new JPanel();
		p3.setBackground(Color.red);
		rightPanel.add(p1);
		rightPanel.add(p2);
		rightPanel.add(p3);

	}

	public void setUpLeftPanel() {

	}

	public JRadioButton createRadioButton(boolean isChecked, boolean isEnabled, String title) {
		JRadioButton b1 = new JRadioButton(title);
		b1.setSelected(isChecked);
		b1.setEnabled(isEnabled);
		return b1;
	}
}
