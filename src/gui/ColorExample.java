package gui;

import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class ColorExample {
	public static void main(String[] args) {
		new GUI("Color Example");
	}
}

class GUI extends JFrame {

	private JButton jbutton1;

	public GUI(String title) {
		super(title);

		JSlider slider = new JSlider();

		jbutton1 = new JButton("Button1");
		jbutton1.setForeground(new Color(255, 255, 255));
		jbutton1.setBackground(Color.BLACK);
		JPanel panel = new JPanel();
		panel.add(jbutton1);
		panel.add(slider);
		add(panel);
		setSize(300, 300);
		setVisible(true);
	}

}