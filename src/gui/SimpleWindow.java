package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleWindow {

	public static void main(String[] args) {
		final int WINDOW_WIDTH = 350, WINDOW_HEIGHT = 250;
		JFrame window = new JFrame("A Simple Window");
		window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		JButton button=new JButton("Hello");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println(JFrame.EXIT_ON_CLOSE);
		window.add(button);
		window.setVisible(true);
	}
}
