package oop_abstractclass;

public class LoginPage extends Page{

	//hidden constructor
	public LoginPage() {
		
		System.out.println("Login page ----constructor");
	}
	
	public LoginPage(int i) {
		super(i);
		System.out.println("Login page ----para constructor:" + i);
	}
	@Override
	public void title() {
		System.out.println("Login page--title");
		
	}

	@Override
	public void url() {
		System.out.println("Login page--url");
	}
	
	public void resetPassword(String nm, String pwd) {
		System.out.println("Login page---- reset pass: "+nm +" : "+pwd);
	}
	
	public void doLogin() {
		System.out.println("Login page---do login");
	}

}
