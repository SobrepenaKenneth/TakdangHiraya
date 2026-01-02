package LoginMenu;
import java.util.ArrayList;
/**
 * Class made by: Ken
 * Version: 0.1
 */
public class UserManager {
	// Make an arrayList from the User class
	ArrayList<User> users = new ArrayList<>();
	
	/**
	 * This method adds a user
	 * @param username Username must be a String
	 * @param password Password must be a String
	 */
	public void addUser(String username, String password) {
		users.add(new User(username,password));
	}
	
	public User login(String username, String password) {
		for (User user : users) {
			if (user.username.equals(username) && user.checkPassword(password)) {
				return user;
			}
		}
		return null;
	}

}
