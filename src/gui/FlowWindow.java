package gui;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowWindow extends JFrame {
	public FlowWindow(String title) {
		super(title);
		// Define new buttons with different width on help of the ---
		JButton jb1 = new JButton("Button 1");
		JButton jb2 = new JButton("Button 2");
		JButton jb3 = new JButton("Button 3");
		JButton jb4 = new JButton("Button 3");
		JButton jb5 = new JButton("Button 3");

		// Define the panel to hold the buttons
		JPanel panel = new JPanel();
		// panel.setLayout(new FlowLayout());
		// to align component to left. default alignment is center
		// FlowLayout fl=new FlowLayout();
		//panel.setLayout(new FlowLayout(FlowLayout.LEFT, 100, 100));
		panel.add(jb1);
		panel.add(jb2);
		panel.add(jb3);
		panel.add(jb4);
		panel.add(jb5);

		// Set the window to be visible as the default to be false
		add(panel);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new FlowWindow("Flow Layout Example");
	}
}
