package oos_encapsulation;

public class Browser {

	
	public void openLoginPage() {
		System.out.println("Enter URL and open Login page");
	    enterUserNamePass();
	    verifyUsernmPass();
	    loginButton();
	    openHomePage();
	    System.out.println("welcome to the home screen");
	}
	
	private void enterUserNamePass() {
		System.out.println("Enter Username and Password");
	}
	
	private void verifyUsernmPass() {
		System.out.println("Entered username and password is correct");
	}
	
	private void loginButton() {
		System.out.println("User logged in successfully");
	}
	
	private void openHomePage() {
		System.out.println("home page opened");
	}
}
