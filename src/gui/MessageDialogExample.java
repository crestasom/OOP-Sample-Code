package gui;

import java.awt.JobAttributes;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MessageDialogExample {

	public static void main(String[] args) {
		while (true) {
			JOptionPane.showMessageDialog(null, "Hello students, This is your first GUI Program","Welcome Screen", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "This program will add two numbers and display the result","Program Info", JOptionPane.INFORMATION_MESSAGE);
			String input = JOptionPane.showInputDialog(null,"Enter 1st Number","Number 1",JOptionPane.QUESTION_MESSAGE);
			int num1 = Integer.parseInt(input);
			input = JOptionPane.showInputDialog(null,"Enter 2nd Number","Number 2",JOptionPane.QUESTION_MESSAGE);
			int num2 = Integer.parseInt(input);
			int num3 = num1 + num2;
			JOptionPane.showMessageDialog(null, "Sum of " + num1 + " and " + num2 + " is " + num3);
			int opt = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?");
			if (opt == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}

		/*
		 * JFrame frame=new JFrame("Message Dialog Example"); frame.setSize(600,600);
		 * JPanel panel=new JPanel(); JButton button1=new
		 * JButton("Show Message Dialog"); JButton button2=new
		 * JButton("Show Input Dialog"); JButton button3=new
		 * JButton("Show Confirmation Dialog"); panel.add(button1); panel.add(button2);
		 * panel.add(button3); frame.add(panel); frame.show(true);;
		 */
	}

}
