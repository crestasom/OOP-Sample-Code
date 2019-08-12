package gui2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class MenuWindow extends JFrame implements ActionListener {

	private JMenuBar menubar;
	private JMenu file;
	private JMenuItem exit;
	private JMenuItem clear;

	public MenuWindow() {
		menubar = new JMenuBar();

		file = new JMenu("File");
		menubar.add(file);

		file.setMnemonic(KeyEvent.VK_F);

		exit = new JMenuItem("Exit");
		file.add(exit);
		exit.setToolTipText("Click to exit from frame.");
		exit.setMnemonic(KeyEvent.VK_X); // adding shortcut and keeping underline in the first letter of the word
		exit.addActionListener(this); // adding action listener to the exit menu
		exit.setActionCommand("exit"); // setting action command to the menu item

		//file.add(new JSeparator());
		clear = new JMenuItem("Clear");
		file.add(clear);
		clear.setToolTipText("Clears the textfield of info part.");
		clear.setMnemonic(KeyEvent.VK_C); // adding shortcut and keeping underline in the first letter of the word
		clear.addActionListener(this); // adding action listener to the clear menu
		clear.setActionCommand("clear"); // setting action command to the menu item

		setJMenuBar(menubar);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MenuWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(exit)) {
			System.exit(0);
		} else if (e.getSource().equals(clear)) {

		}
	}
}
