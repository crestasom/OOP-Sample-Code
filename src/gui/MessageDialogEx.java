package gui;

import javax.swing.JOptionPane;

public class MessageDialogEx {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter Your name");
		String input = JOptionPane.showInputDialog("Enter Your age");
		int age = Integer.parseInt(input);
		JOptionPane.showMessageDialog(null, name + ":" + age);
	}

}
