package gui2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MnemonicAndTootTipExample extends JFrame implements ActionListener {
	JPanel leftPanel, rightPanel;
	JLabel label1, label2, label3;
	JTextField name, email, phone;
	JButton b1, b2, b3, b4;

	public MnemonicAndTootTipExample(String title) {
		super(title);
		initializeAll();
		setLayout(new GridLayout(1, 2));
		leftPanel = new JPanel();
		leftPanel.setBackground(Color.RED);
		rightPanel = new JPanel();
		rightPanel.setBackground(Color.BLUE);
		rightPanel.setLayout(new GridLayout(2, 2));
		add(leftPanel);
		add(rightPanel);

		leftPanel.add(label1);
		leftPanel.add(name);
		leftPanel.add(label2);
		leftPanel.add(email);
		leftPanel.add(label3);
		leftPanel.add(phone);

		rightPanel.add(b1);
		rightPanel.add(b2);
		rightPanel.add(b3);
		rightPanel.add(b4);

		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public void initializeAll() {
		label1 = new JLabel("Name");
		label2 = new JLabel("Email");
		label3 = new JLabel("Phone");
		name = new JTextField(25);
		email = new JTextField(25);
		phone = new JTextField(25);
		b1 = new JButton("Add");
		b1.setMnemonic(KeyEvent.VK_A);
		b1.setToolTipText("Click here to add new record");
		b1.addActionListener(this);
		b2 = new JButton("Edit");
		b2.setToolTipText("Click here to edit record");
		b2.setMnemonic(KeyEvent.VK_E);
		b2.addActionListener(this);
		b3 = new JButton("Update");
		b3.setToolTipText("Click here to update record");
		b3.setMnemonic(KeyEvent.VK_U);
		b3.addActionListener(this);
		b4 = new JButton("Delete");
		b4.setToolTipText("Click here to delete record");
		b4.setMnemonic(KeyEvent.VK_D);
		b4.addActionListener(this);

	}

	public static void main(String[] args) {
		new MnemonicAndTootTipExample("Nested Layout Example");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(b1)) {
			JOptionPane.showMessageDialog(null, "add button is pressed");
		}
		if (e.getSource().equals(b2)) {
			JOptionPane.showMessageDialog(null, "edit button is pressed");
		}
		if (e.getSource().equals(b3)) {
			JOptionPane.showMessageDialog(null, "update button is pressed");
		}
		if (e.getSource().equals(b4)) {
			JOptionPane.showMessageDialog(null, "delete button is pressed");
		}

	}
}
