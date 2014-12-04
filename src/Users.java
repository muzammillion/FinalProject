import java.util.ArrayList;


/**
 * @author Muzammil
 *
 */
public class Users extends Login{
	//set up the arrays here, create a list that grows with the register window
		public ArrayList<String> validUsers;
		public ArrayList<String> validPasswords;
	/**
	 * 
	 */
	public Users(){
		validUsers = new ArrayList<String>();
		validPasswords = new ArrayList<String>();
		
		validUsers.add("muz");
		validPasswords.add("muz");
	}
	/**
	 * @return
	 */
	public ArrayList<String> getValidUsers(){
	    return validUsers;
	}
	/**
	 * @return
	 */
	public ArrayList<String> getValidPasswords(){
	    return validPasswords;
	}
}
