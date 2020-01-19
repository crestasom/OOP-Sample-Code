package gui;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javafx.scene.layout.Pane;

public class BackGroundJSlider extends JFrame implements ChangeListener {
	JSlider rSlider, gSlider, bSlider;
	JPanel p, p2;

	public BackGroundJSlider(String title) throws HeadlessException {
		super(title);

		rSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
		rSlider.setMajorTickSpacing(5);
		rSlider.setMinorTickSpacing(1);
		rSlider.setPaintLabels(true);
		rSlider.setPaintTicks(true);
		rSlider.addChangeListener(this);

		gSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
		gSlider.setMajorTickSpacing(5);
		gSlider.setMinorTickSpacing(1);
		gSlider.setPaintLabels(true);
		gSlider.setPaintTicks(true);
		gSlider.addChangeListener(this);

		bSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
		bSlider.setMajorTickSpacing(5);
		bSlider.setMinorTickSpacing(1);
		bSlider.setPaintLabels(true);
		bSlider.setPaintTicks(true);
		bSlider.addChangeListener(this);

		int blue, green, red;
		red = rSlider.getValue();
		green = gSlider.getValue();
		blue = bSlider.getValue();

		p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.add(rSlider);
		p.add(gSlider);
		p.add(bSlider);
		p2 = new JPanel();
		p2.setBackground(new Color(red, green, blue));
		p.add(p2);
		add(p);
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BackGroundJSlider("RGB");
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		int blue, green, red;
		red = rSlider.getValue();
		green = gSlider.getValue();
		blue = bSlider.getValue();
		System.out.println(red + ":" + green + ":" + blue);
		p2.setBackground(new Color(red, green, blue));
	}

}
