package oop_multipleInheritance;

public class LoginPage extends Page{

	@Override
	public void getColor() {
		System.out.println("Page-----Orange color");
	}
	
	public void doLogin() {
		System.out.println("do login");
	}
}
