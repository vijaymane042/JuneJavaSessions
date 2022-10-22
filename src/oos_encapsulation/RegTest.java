package oos_encapsulation;

public class RegTest {

	public static void main(String[] args) {
	Registration r= new Registration("Vijay", "vijaymane@gmail.com");
	System.out.println(r.getFirstname()+" "+r.getEmail());
	System.out.println(r.getFirstname()+" "+r.getAddress()+" "+r.getMobileno());
	r.setLastname("Mane");
	r.setAddress("Pune");
	r.setMobileno("1234567890");
	System.out.println(r.getFirstname()+" "+r.getAddress()+" "+r.getMobileno());
	
//	System.out.println(r.getFirstname());
//	System.out.println(r.getLastname());
//	System.out.println(r.getAddress());
//	System.out.println(r.getEmail());
//	System.out.println(r.getMobileno());
    //Login Page:
	System.out.println("Login page calss method calling");
	LoginPage admin = new LoginPage("Vijay", "Vijay@12");
	System.out.println(admin.getUsername()+" "+ admin.getPassword());
	admin.doLoginMethod();
	}

}
