package th.in.nagi.swp.service;

import java.util.HashMap;
import java.util.Map;

import th.in.nagi.swp.model.User;

public class UserService {

	private static Map<String, User> users = new HashMap<String, User>();

	private UserService() {
		users.put("admin", new User("admin", "1234"));
	}

	public User addUser(User newUser) {
		return users.putIfAbsent(newUser.getUsername(), newUser);
	}

	public User find(String username, String password) {
		User user = users.get(username);
		if (user != null) {
			return (user.checkPassword(password)) ? user : null;
		}
		return null;
	}

	/**
	 * Instead of connecting to database we decide to use singleton.
	 */
	private static UserService instance;

	public static UserService getInstance() {
		if (instance == null) {
			return new UserService();
		} else {
			return instance;
		}
	}
}