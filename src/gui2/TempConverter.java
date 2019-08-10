package gui2;

import java.awt.HeadlessException;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TempConverter extends JFrame implements ChangeListener {
	JSlider tempSlider;
	JLabel label;
	public TempConverter(String title) {
		super(title);
		tempSlider=new JSlider(JSlider.HORIZONTAL,20,100,25);
		tempSlider.setMajorTickSpacing(5);
		tempSlider.setMinorTickSpacing(1);
		tempSlider.setPaintLabels(true);
		tempSlider.setPaintTicks(true);
		tempSlider.addChangeListener(this);
		JPanel panel=new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(tempSlider);
		
		label=new JLabel();
		panel.add(label);
		
		add(panel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);

	}
	public static void main(String[] args) {
		new TempConverter("Jslider example");
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		int val=tempSlider.getValue();
		double valF=9/5.0*val+32;
		label.setText(val+" in Farenheit is "+valF);
		
	}

}
