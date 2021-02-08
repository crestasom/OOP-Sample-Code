package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameSwitchDemo {
	public static void main(String[] args) {
		new FrameMain();
	}
}

class FrameMain extends JFrame {

	public FrameMain() {
		JButton b1 = new JButton("Go to second frame");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FrameSecond fs = new FrameSecond(FrameMain.this);
				fs.setVisible(true);
				setVisible(false);
			}
		});
		add(b1);
		setSize(300, 300);
		setVisible(true);
	}
}

class FrameSecond extends JFrame {

	FrameMain main;

	public FrameSecond(FrameMain m1) {
		main = m1;
		JButton b1 = new JButton("Go to main frame");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				main.setVisible(true);
				dispose();
			}
		});
		add(b1);
		setSize(300, 300);

	}
}