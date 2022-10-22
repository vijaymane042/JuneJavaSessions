package oos_encapsulation;

public class LoginPage {

	private String username;
	private String password;
	//constructor
	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}
	//getter and setter
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void doLoginMethod() {
	System.out.println("Enter user name: "+ username);
	System.out.println("Enter Password: "+ password);
	System.out.println("login successfully");
	}
	
	
}
