import java.util.Scanner;
/**
 * Class made by: Ken
 * Version: 0.1
 */
public class LoginApp {
	public static void main(String[] args) {
		// Scanner object
		Scanner scan = new Scanner(System.in);
		// UserManager object
		UserManager manager = new UserManager();
		
		// Temporary User
		manager.addUser("admin", "admin");
		
		// Ask the user the username
		System.out.println("Username: ");
		String username = scan.nextLine();
		
		// Ask the username the password
		System.out.println("Password: ");
		String password = scan.nextLine();
		
		User user = manager.login(username, password);
		
		if (user != null) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Invalid credentials.");
		}
	}

}
