package javasessions;

public class EmployeeType {
    
	String name;
	int age;
	double salary;
	
	//constructor of the class
	//const.name is the same as the class name
	//const..can not be return anything but function may or may not be anything
	//const...no void keyword
	public void testMethod() {
		System.out.println("Test Method...");
	}
	public EmployeeType() {// 0 parameter
		System.out.println("default constructor...");
	}
	
	public EmployeeType(int a) {// 1 parameter const
		System.out.println("1 para const :"+a); 
	}
	
	public EmployeeType(int a, String b) {// 2 para
		System.out.println("2 para const :"+a + " " +b);
	}
	public static void main(String[] args) {
	EmployeeType e = new EmployeeType(10);
	EmployeeType e1 = new EmployeeType(10,"vijay");
    e.testMethod();
	}

}
