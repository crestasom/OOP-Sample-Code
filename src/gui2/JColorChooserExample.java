package gui2;

import java.awt.Color;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JColorChooserExample extends JFrame {
	public JColorChooserExample(String title) {
		super(title);
		JPanel panel = new JPanel();
		Color selectedColor = JColorChooser.showDialog(null, "Select a Background Color", Color.BLUE);
		panel.setBackground(selectedColor);
		add(panel);
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JColorChooserExample("Color Chooser Example");
	}
}
