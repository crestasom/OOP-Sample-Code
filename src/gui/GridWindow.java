package gui;

import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridWindow extends JFrame {

	public GridWindow(String title) throws HeadlessException {
		super(title);

		// Define new buttons
		JButton jb1 = new JButton("Button 1");
		JButton jb2 = new JButton("Button 2");
		JButton jb3 = new JButton("Button 3");
		JButton jb4 = new JButton("Button 4");
		JButton jb5 = new JButton("Button 5");

		// Define the panel to hold the buttons
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3));
		panel.add(jb1,0);
		panel.add(jb2,1);
		panel.add(jb3,2);
		panel.add(jb4,3);
		panel.add(jb5,2);
		
		add(panel);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridWindow("Grid Layout Example");
		
		
		
		
		
		
	}
}
