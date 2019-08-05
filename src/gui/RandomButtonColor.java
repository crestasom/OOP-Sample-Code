package gui;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RandomButtonColor {
	public static void main(String[] args) {
		new GUI1("Random Button Color Example");
	}
}

class GUI1 extends JFrame {

	private JButton jbutton1;

	public final Color[] cList= {Color.WHITE,Color.BLACK,Color.RED,Color.BLUE,Color.GREEN,Color.YELLOW,Color.CYAN};
	public GUI1(String title) throws HeadlessException {
		super(title);
		jbutton1 = new JButton("Button1");
		jbutton1.setForeground(Color.GRAY);
		jbutton1.setBackground(Color.BLACK);
		ButtonListener bl=new ButtonListener();
		jbutton1.addActionListener(bl);
		JPanel panel =new JPanel();
		panel.add(jbutton1);
		add(panel);
		setSize(300,300);
		setVisible(true);
		
	}
	
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int rand=(int)(Math.random()*100)%cList.length;
			jbutton1.setForeground(cList[rand]);
			rand=(int)(Math.random()*100)%cList.length;
			jbutton1.setBackground((cList[rand]));
		}
		
	}

}