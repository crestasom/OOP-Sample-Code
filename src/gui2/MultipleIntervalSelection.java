package gui2;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MultipleIntervalSelection extends JFrame implements ListSelectionListener {
	String[] monthList = { "Janaury", "Febuary", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };
	JList<String> nameList;
	JTextField choose;

	public MultipleIntervalSelection() {
		// TODO Auto-generated constructor stub

		choose = new JTextField("You have chosen:");
		choose.setEditable(false);
		JPanel panel = new JPanel();
		nameList = new JList<>(monthList);
		nameList.addListSelectionListener(this);
		nameList.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		nameList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		panel.add(nameList);
		panel.add(choose);
		add(panel);

		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MultipleIntervalSelection();
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		choose.setText("You have chosen:" + nameList.getSelectedValue());

	}
}
