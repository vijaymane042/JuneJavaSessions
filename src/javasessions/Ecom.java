package javasessions;

public class Ecom {
    //Method overloading:(Static polymorphism)
	// 	Method overloading happens only within the same class when we have methods with: -
//	1.	Methods with the same name.
//	2.	With the different number of parameters.
//	3.	 The different sequences of the parameter.
//user friendly design
	public void test()//0 parameter
	{
	System.out.println("0 parameter");	
	}
	public void test(int i)//1 parameter
	{	
	}
	public void test(String k)//2 parameter
	{	
	}
	public void test(int p, String k)//2 parameter
	{	
	}
	public void test(String b,int a)//2 parameter
	{	
	}
	//login
	public void login() {
	}
	public void login(String name) {
	}
	public void login(String name, String pwd) {
	}
	//payment
	public void doPayment(String upi) {
	}
	public void doPayment(String cc, int cvv, int otp) {
	}
	public void doPayment(String paypalID,String pwd) {
	}
	//booking
	public void booking(String frmLoc, String toLoc) {
	}
	public void booking(String frmLoc, String toLoc, String carType) {
	}
	public void booking(String frmLoc, String toLoc, String carType, String charges) {
	}
	public static void main(String[] args) {
	
		Ecom e = new Ecom();
		e.test();

	}

}
