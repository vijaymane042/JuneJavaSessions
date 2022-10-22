package javasessions;

public class LoginPage {

	String username;
	String password;
	
	
	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}
    public void doLogin(String un, String pwd) {
    	System.out.println("Enter username :" + un);
    	System.out.println("Enter password :"+ pwd);
    	System.out.println("Click on Login button");
    	System.out.println("User is loged in successfully");
    	
    }

	public static void main(String[] args) {
		
    LoginPage lp = new LoginPage("VIJAY", "VIJAY@12");
    lp.doLogin(lp.username, lp.password);
    
    LoginPage lp1 = new LoginPage("JAY", "VIJAY@12");
    lp1.doLogin(lp1.username, lp1.password);
	}

}
