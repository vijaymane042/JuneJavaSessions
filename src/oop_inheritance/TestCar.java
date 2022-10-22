package oop_inheritance;

public class TestCar {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();//Override
		c.carFeature();
		c.startVehical();
		System.out.println("-----------------------");
		System.out.println(c.speed);
		System.out.println(Car.wheels);
		
		
		BMW b = new BMW();
		b.start();
		b.bmwEngine();
		b.carStop();
		b.carFeature();
		b.startVehical();
		System.out.println(b.speed);
		System.out.println(BMW.wheels);
		
		//down casting
		//parent class object can be referred by child class ref variable
		//BMW b1= (BMW) new Car();//ClassCastException is occurred
		//b1.bmwEngine();
		//Car is Parent class and BMW is child class
		//c1 is new BMW() is reference type 
		System.out.println("-----------------------");
		
		//child class object can be referred by parent ref variable
		//top/up casting
		Car c1 = new BMW();
		c1.start();
		c1.carFeature();
		
		System.out.println("-----------------------");
		Vehical v = new Vehical();	
		v.startVehical();
		
		System.out.println("-----------------------");
		Vehical v1 = new Car();
		v1.startVehical();
		
		System.out.println("-----------------------");
		Vehical v2 = new BMW();
		v2.startVehical();
		
		
		
		
		
		
		
	}

}
