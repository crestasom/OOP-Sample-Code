package gui;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class SimpleWindow2 extends JFrame {

	public static void main(String[] args) {
		SimpleWindow2 window = new SimpleWindow2("A Simple Window");
		window.initialize();

	}

	public void initialize() {
		final int WINDOW_WIDTH = 350, WINDOW_HEIGHT = 250;
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public SimpleWindow2(String title) {
		super(title);

	}

}
