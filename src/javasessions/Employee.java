package javasessions;

public class Employee {
	//data members: data variables + methods
	
    //no input and no return type
	//Void : does not return anything
	public void test() {
		System.out.println("test method");
	}
	
	//2.no input and some return
	//return type: string
	public String getName() {
		System.out.println("get name method :");
		String n ="Vijay";
		return n;
	}
	
	public int add() {
		int a = 10;
		int b = 20;
		int c = a+ b;
		return c;
	}
	
	//3. some input and some return
	public int substraction(int x, int y)//parameters
	{
		int z = x - y;
		return z;
	}
	
	//1 way of return
	public int getMarks(String studName) {
	System.out.println("getting student marks for :" +studName);	
	if(studName.contains("Vijay"))
	{
		System.out.println("Its vijay and marks is:");
		return 77;
	}else if(studName.contains("Jaya"))
	{
		System.out.println("Its Jaya and marks is:");
		return 70;
	}else if(studName.contains("Yogesh"))
	{
		System.out.println("Its Yogesh and marks is:");
		return 90;
	}else
	{
		System.out.println("Invalid name :" +studName);
		return -1;
	}
	}
	//2nd way of return
	public int getMarks1(String studName) {
		System.out.println("getting student marks for :" +studName);
		int marks = -1;
		if(studName.contains("Vijay"))
		{
			System.out.println("Its vijay and marks is:");
			marks=77;
		}else if(studName.contains("Jaya"))
		{
			System.out.println("Its Jaya and marks is:");
			marks= 70;
		}else if(studName.contains("Yogesh"))
		{
			System.out.println("Its Yogesh and marks is:");
			marks= 90;
		}else
		{
			System.out.println("Invalid name :" +studName);
		}
		return marks;
	}
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.test();
        String text=e.getName();
        System.out.println(text);
        System.out.println(e.getName());
        System.out.println(text + 100);
        
        int sum = e.add();
        System.out.println("sum:" +sum);
        
        int sub=e.substraction(10,5);//method arguments
        System.out.println(sub);
        int c = sum + sub;
        System.out.println("Combine :" +c);
        
        int studNM=e.getMarks("Jaya");
        System.out.println(studNM);
        
        int studNM1=e.getMarks1("vijay");
        System.out.println(studNM1);
        }

}
