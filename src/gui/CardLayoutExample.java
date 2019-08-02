package gui;

/*
 * A Java swing CardLayout example 
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample extends JFrame implements ActionListener {

	public static CardLayout card = new CardLayout(40, 30);
	public static JPanel c;
	JButton jb1, jb2, jb3;
	
	public CardLayoutExample() {
		c = new JPanel();
		c.setLayout(card);
		
		// Define new buttons
		jb1 = new JButton("Button 1");		
		jb2 = new JButton("Button 2");
		jb3 = new JButton("Button 3");		
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);
		add(c);
	}
	
	public static void main(String[] args) {
		// Create and set up a frame window
		CardLayoutExample cl = new CardLayoutExample();
		cl.setSize(300, 300);
		cl.setVisible(true);
		cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	// Action listener
    public void actionPerformed(ActionEvent e) {  
    	card.next(c);  
    }  

}

