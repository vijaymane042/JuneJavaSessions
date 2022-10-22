package oop_abstractclass;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp= new LoginPage(10);//called default constructor
		lp.displayLogo();
		lp.title();
		lp.url();
		lp.resetPassword("vijay","vijay");
		lp.doLogin();
		
		//Page p = new Page();
//		System.out.println("-----Called constructor");
        //top casting
		//child class object can be referred by abstract parent class reference variable
		Page p=new LoginPage();
		p.displayLogo();
		p.timeOut();
		p.title();
		p.url();
		
			
			
	}

}
