package gui;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutExample extends JFrame {

	public BoxLayoutExample(String title) {
		super(title);
		JPanel panel=new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JButton b1=new JButton("Button 1");
		JButton b2=new JButton("Button 2");
		JButton b3=new JButton("Button 3");
		JButton b4=new JButton("Button 4");
		JButton b5=new JButton("Button 5");
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		add(panel);
		setSize(600,600);
		setVisible(true);
				
	}
	
	public static void main(String[] args) {
		new BoxLayoutExample("Box Layout");
	}
	
	
	
}
