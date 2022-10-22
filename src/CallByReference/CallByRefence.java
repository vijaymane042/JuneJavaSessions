package CallByReference;

public class CallByRefence {

	String name ;
	int age ;
	
	public void getMethod(CallByRefence e) {
		System.out.println("Name is 1:"+ name + " age :"+age);
		e.name = "Zak";
		e.age =35;
		System.out.println("Name is 2:"+ name + " age :"+age);
		sendMail(e);
	}
	public void getMethod(String name) {
		System.out.println("Name is 6:"+name);
	}
	public void sendMail(CallByRefence e1) {
		e1.name = "peter";
		e1.age =55;
		System.out.println("Name is 3:"+ name + " age :"+age);
		
	}
	public static void main(String[] args) {
	
		CallByRefence cbr = new CallByRefence();
		cbr.name = "Vijay";
		cbr.age = 30;
		System.out.println("Name is 4:"+cbr.name + " age :"+cbr.age);
		cbr.getMethod(cbr);
		System.out.println("Name is 5:"+ cbr.name + " age :"+cbr.age);
		cbr.getMethod(cbr.name);
	}

}
