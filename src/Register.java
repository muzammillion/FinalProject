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
 * @author Muzammil
 *
 */

public class Register extends JFrame{
//different variables to set up the JFrame
	private JTextField newuser;
	private JTextField newpass;
	private JButton register;
	private JButton cancel;
	
	/**
	 * 
	 */
	public Register(){
		super("Register");
	setLayout(new FlowLayout());
	
	newuser = new JTextField(15);
	add(newuser);
	
	newpass = new JPasswordField(15);
	add(newpass);
	
	register = new JButton("Register");
	add(register);
	register.addActionListener(new RegisterListener());
	
	cancel = new JButton("Cancel");
	add(cancel);
	cancel.addActionListener(new CancelListener());
	}
	//Register the username and password into arrays
	public class RegisterListener implements ActionListener{
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public ArrayList<String> validUsers;
		public ArrayList<String> validPasswords;
		public void actionPerformed(ActionEvent e){
		if(newuser.getText().trim().length() == 0 || newpass.getText().length() == 0){
				JOptionPane.showMessageDialog(null, "Please enter a new username and password.");
			}
		else{
		String user = newuser.getText();
		String pass = newpass.getText();
		JOptionPane.showMessageDialog(null, "New username: "+user+ ", New password: "+pass);
		dispose();
		}
		}
	}
	//Closes the window
	public class CancelListener implements ActionListener{
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e){
			dispose();
		}
		}
	
}
