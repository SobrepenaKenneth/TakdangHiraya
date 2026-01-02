package LoginMenu;
import java.util.Scanner;
/**
 * Class made by: Ken
 * Version: 0.1
 */
public class User {
	public static Scanner scan = new Scanner(System.in);
	
	public String username;
	public String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public boolean checkPassword(String input) {
		return password.equals(input);
	}

}
