package javasessions;

public class CarType {

	String name;
	int price;
	String noPlate;
	//int wheels;
	static int wheels =4 ;
	
	public static void main(String[] args) {
		
		CarType c1=new CarType();
		c1.name ="Innova";
		c1.price = 10000;
		c1.noPlate ="MH12JT7788";
		//c1.wheels = 4;
		//1: use the class name
		System.out.println(CarType.wheels);
		
		CarType c2=new CarType();
		c2.name ="Tata";
		c2.price = 20000;
		c2.noPlate ="MH12JT7789";
		//c2.wheels = 4;
		//2. can call direct/direct access
		System.out.println(wheels);
		
		CarType c3=new CarType();
		c3.name ="Maruti";
		c3.price = 40000;
		c3.noPlate ="MH12JT7790";
		//c3.wheels = 4;
		//3. use object ref to call-giving warning not error when access
		System.out.println(c3.wheels);
		
		
	}

}
