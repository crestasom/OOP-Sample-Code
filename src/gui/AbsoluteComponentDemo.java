package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AbsoluteComponentDemo extends JFrame {

	public AbsoluteComponentDemo() {
		JButton button = new JButton("Button 1");
		button.setBounds(99, 88, 100, 30);
		add(button);
		setLayout(null);
		setSize(400, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AbsoluteComponentDemo();
	}
}
