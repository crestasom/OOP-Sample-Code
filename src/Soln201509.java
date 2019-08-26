import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Soln201509 extends JFrame {
	JLabel title, subTitle, user, pass;
	JTextField un, pw;
	JPanel userPanel, passPanel, mainPanel;
	JButton login;

	public Soln201509(String title) {
		super(title);
		setUpUI();
	}

	public void setUpUI() {
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		title = new JLabel("SWEETY BAKERY");
		mainPanel.add(title);
		subTitle = new JLabel("LOGIN PAGE");
		mainPanel.add(subTitle);
		userPanel = new JPanel();
		userPanel.setLayout(new BoxLayout(userPanel, BoxLayout.X_AXIS));
		user = new JLabel("User Name");
		userPanel.add(user);
		un = new JTextField(10);
		userPanel.add(un);
		mainPanel.add(userPanel);
		passPanel = new JPanel();
		passPanel.setLayout(new BoxLayout(passPanel, BoxLayout.X_AXIS));
		pass = new JLabel("Password");
		passPanel.add(pass);
		pw = new JTextField(10);
		passPanel.add(pw);
		mainPanel.add(passPanel);
		
		login = new JButton("LOGIN");

		login.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String uname = un.getText();
				String pwd = pw.getText();
				if (uname.equals("Sangeetha") && pwd.equals("Sangeetha")) {

				} else {
					JOptionPane.showMessageDialog(null, "Username or password incorrect!", "ERROR",
							JOptionPane.WARNING_MESSAGE);
				}

			}
		});

		mainPanel.add(login);

		add(mainPanel);
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Soln201509("Design Preview [Login]");
	}
}
