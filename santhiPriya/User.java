package santhiPriya;
//inheritance
//base class
public class User {
	
	protected String username;
	protected String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public void login() {
		System.out.println(username + " logged in ");
	}
	
	public void logout() {
		System.out.println(username + " logged out ");
	}
	
}
