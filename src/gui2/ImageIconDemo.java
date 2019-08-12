package gui2;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ImageIconDemo extends JFrame {

	
	public ImageIconDemo(String title) {
		super(title);
		ImageIcon imageIcon=new ImageIcon("splash.gif");
		JLabel label=new JLabel(imageIcon);
		label.setText("IconDemo");
		add(label);
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ImageIconDemo("Image Icon Demo");
	}
}
