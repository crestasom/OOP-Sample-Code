package gui2;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListDemo extends JFrame implements ListSelectionListener{
	String[] names = { "Bill", "Geri", "Greg", "Jean", "Kirk", "Phillip", "Susan" };
	JList<String> nameList;
	JTextField choose;

	public JListDemo() {
		// TODO Auto-generated constructor stub

		choose=new JTextField("You have chosen:");
		choose.setEditable(false);
		JPanel panel=new JPanel();
		nameList = new JList<>(names);
		nameList.addListSelectionListener(this);
		nameList.setBorder(
				  BorderFactory.createLineBorder(Color.black,1));
		//uncomment this and comment the next line to see demo of scrollbar
		/*
		 * nameList.setVisibleRowCount(3); JScrollPane scrollPane=new
		 * JScrollPane(nameList); panel.add(scrollPane);
		 */
		panel.add(nameList);
		panel.add(choose);
		add(panel);
		
		
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new JListDemo();
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		choose.setText("You have chosen:"+nameList.getSelectedValue());
		
	}
}
