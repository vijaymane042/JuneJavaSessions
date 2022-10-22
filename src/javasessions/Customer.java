package javasessions;

public class Customer {

    String name;
    int age;
    static String compName = "ABC";
    
	public void sendMail() {
	System.out.println("send email");	
	}
	
	public static void getInfo() {
		System.out.println("get info");
		
	}
	public static void main(String[] args) {

		Customer c =new Customer();
		c.name = "Jason";
		c.age = 35 ;
		
		System.out.println(c.name + " " + c.age + " " + Customer.compName);
		System.out.println(compName);
		//how to access static methods
		//1: using class name
		Customer.getInfo();
		
		//2: calling directly
		getInfo();
		
		//3. using object reference
		c.getInfo();//not recommended
		
		//how to access non static variables and methods: we have to create the object and then access
		c.sendMail();

	}

}
