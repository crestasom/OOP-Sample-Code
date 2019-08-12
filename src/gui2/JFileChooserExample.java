package gui2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class JFileChooserExample extends JFrame implements ActionListener {
	JFileChooser choser;
	JButton open, save;

	public JFileChooserExample(String title) {
		super(title);
		choser = new JFileChooser();
		
		open = new JButton("Show File Opener");
		open.addActionListener(this);
		save = new JButton("Show File Saver");
		save.addActionListener(this);
		add(open,BorderLayout.EAST);
		add(save,BorderLayout.WEST);
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFileChooserExample("File Chooser Example");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(open)) {
			int status=choser.showOpenDialog(null);
			
			if (status == JFileChooser.APPROVE_OPTION)
			{
			  File selectedFile =
					  choser.getSelectedFile();
			  String filename = selectedFile.getPath();
			  JOptionPane.showMessageDialog(null, 
			                 "You selected " + filename);
			}
			
		}else if (e.getSource().equals(save)) {
			int status=choser.showSaveDialog(null);
			if (status == JFileChooser.APPROVE_OPTION)
			{
			  File selectedFile =
					  choser.getSelectedFile();
			  String filename = selectedFile.getPath();
			  JOptionPane.showMessageDialog(null, 
			                 "You selected " + filename);
			}
		}
	}
}
