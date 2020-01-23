package gui;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BackGroundJSlider extends JFrame implements ChangeListener {
	JSlider rSlider, gSlider, bSlider;
	JPanel p, p2;

	public BackGroundJSlider(String title) throws HeadlessException {
		super(title);

		rSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
		rSlider.setMajorTickSpacing(20);
		rSlider.setMinorTickSpacing(5);
		rSlider.setPaintLabels(true);
		rSlider.setPaintTicks(true);
		rSlider.addChangeListener(this);

		gSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
		gSlider.setMajorTickSpacing(20);
		gSlider.setMinorTickSpacing(5);
		gSlider.setPaintLabels(true);
		gSlider.setPaintTicks(true);
		gSlider.addChangeListener(this);

		bSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
		bSlider.setMajorTickSpacing(20);
		bSlider.setMinorTickSpacing(5);
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
		p2.setBackground(new Color(red, green, blue));
	}

}
