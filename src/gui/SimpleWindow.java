package gui;

import javax.swing.JFrame;

public class SimpleWindow {

	public static void main(String[] args) {
		final int WINDOW_WIDTH = 350, WINDOW_HEIGHT = 250;
		JFrame window = new JFrame("A Simple Window");
		window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		window.setVisible(true);
	}
}
