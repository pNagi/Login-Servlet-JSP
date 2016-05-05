package th.in.nagi.swp.model;

import java.security.MessageDigest;

public class User {

	private String username;
	private String password;

	private static MessageDigest md;

	public User(String username, String password) {
		this.username = username;
		this.password = encrypt(password);
	}

	private String encrypt(String password) {
		try {
			md = MessageDigest.getInstance("MD5");
			byte[] passwordBytes = password.getBytes();
			md.reset();
			byte[] digested = md.digest(passwordBytes);
			StringBuffer buffer = new StringBuffer();
			for (int i = 0; i < digested.length; i++) {
				buffer.append(Integer.toHexString(0xff & digested[i]));
			}
			return buffer.toString();
		} catch (Exception e) {
			return null;
		}
	}

	public String getUsername() {
		return username;
	}

	public boolean checkPassword(String guess) {
		return password.equals(encrypt(guess));
	}
}