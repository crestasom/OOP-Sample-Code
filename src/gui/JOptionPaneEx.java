package gui;

import javax.swing.JOptionPane;

public class JOptionPaneEx {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello World");

		String name = JOptionPane.showInputDialog("Enter Your name");
		if (name != null) {
			JOptionPane.showMessageDialog(null, name, "Name", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Cancel is pressed", "Error", JOptionPane.ERROR_MESSAGE);
		}
		System.exit(0);

	}
}
