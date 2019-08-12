package gui2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JComboBoxDemo extends JFrame implements ActionListener{
	String[] names = { "Bill", "Geri", "Greg", "Jean", "Kirk", "Phillip", "Susan" };
	
	JComboBox<String> nameList;
	JTextField choose;

	public JComboBoxDemo() {
		// TODO Auto-generated constructor stub

		choose=new JTextField(25);
		choose.setText("You have chosen:");
		choose.setEditable(false);
		JPanel panel=new JPanel();
		nameList = new JComboBox<>(names);
		nameList.addActionListener(this);
		nameList.setEditable(true);
		//uncomment this to set jcombobox to editable mode
		//nameList.setEditable(true);
		
		nameList.setBorder(
				  BorderFactory.createLineBorder(Color.black,1));
		//uncomment this and comment the next line to see demo of scrollbar
		/*
		 * nameList.setVisibleRowCount(3); JScrollPane scrollPane=new
		 * JScrollPane(nameList); panel.add(scrollPane);
		 */
		//uncomment below to set monthList to JList 
		//nameList.setListData(monthList);
		panel.add(nameList);
		panel.add(choose);
		add(panel);
		
		
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new JComboBoxDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		choose.setText("You have chosen:"+nameList.getSelectedItem());	
	}


}
