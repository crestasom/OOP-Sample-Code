package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EventObjectDemo {

	public static void main(String[] args) {
		new EventObjectWindow("Multi Button Event Listener");
	}
}

class EventObjectWindow extends JFrame {

	private JButton b1;
	private JButton b2;

	public EventObjectWindow(String title) {
		super(title);
		this.b1 = new JButton("Button 1");
		b1.setActionCommand("Button1");
		b1.addActionListener(new MultiButtonEventListener());
		this.b2 = new JButton("Button 2");
		b2.setActionCommand("Button2");
		b2.addActionListener(new MultiButtonEventListener());
		JPanel panel = new JPanel();
		panel.add(b1);
		panel.add(b2);
		add(panel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);

	}

	private class MultiButtonEventListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource().equals(b1)) {
				JOptionPane.showMessageDialog(null, "Button 1 is clicked");
			} else if (e.getSource().equals(b2)) {
				JOptionPane.showMessageDialog(null, "Button 2 is clicked");
			}

			// you can use this also
			/*
			 * if (e.getActionCommand().equals("Button1")) {
			 * JOptionPane.showMessageDialog(null, "Button 1 is clicked"); } else if
			 * (e.getActionCommand().equals("Button2")) {
			 * JOptionPane.showMessageDialog(null, "Button 2 is clicked"); }
			 */
		}

	}

}