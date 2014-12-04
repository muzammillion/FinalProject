import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author Muzammil Shafiq
 *
 */
public class Login extends JFrame{
	//different variables to set the JFrame
	private JButton login;
	private JButton exit;
	private JButton register;
	private JTextField user;
	private JPasswordField pass;
	private ArrayList<String> validUsers;
	private ArrayList<String> validPasswords;
	public Users Userlist;
	
	/**
	 * 
	 */
	public Login(){
		//setting the JFrame
		super("Login");
		JOptionPane.showMessageDialog(null, "Login(Default Username: muz, Default Password: muz)");
	setLayout(new FlowLayout());
	
	user = new JTextField(15);
	add(user);
	
	pass = new JPasswordField(15);
	add(pass);
	
	login = new JButton("Login");
	add(login);
	login.addActionListener(new LoginListener());
	
	register = new JButton("Register");
	add(register);
	register.addActionListener(new RegisterListener());
	
	exit = new JButton("Exit");
	add(exit);
	exit.addActionListener(new ExitListener());
	}
	
	public class LoginListener implements ActionListener{
		//Check if the login was cleared and go to the next part if applicable
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e){
			if(user.getText().trim().length() == 0 || pass.getText().length() == 0){
				JOptionPane.showMessageDialog(null, "Please fill out both spaces.");
			}
			else if(user.getText().equals("muz") && pass.getText().equals("muz"))
			{
				JOptionPane.showMessageDialog(null, "Login Complete!");
				Products prod = new Products();
				prod.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				prod.setSize(400, 300);
				prod.setVisible(true);
		        dispose();
			}
			else{
				JOptionPane.showMessageDialog(null, "Username/Password is incorrect.");
				user.setText("");
		        pass.setText("");
			}
		}
	
	}
	
	public class RegisterListener implements ActionListener{
		//Open the register window
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e){
			Register reg = new Register();
			reg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			reg.setSize(200, 150);
			reg.setVisible(true);
		}
		}
	public class ExitListener implements ActionListener{
		//Close the program
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
		}
}
