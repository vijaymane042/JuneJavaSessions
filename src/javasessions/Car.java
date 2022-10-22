package javasessions;

public class Car {

	//instance class vars:
	
			String name;
			int price;
			String color;
			boolean isAutomatic;
			
			
	public static void main(String[] args) {
		
		//create class object
		Car c1 = new Car();//Object reference name
		int i = 1;
		while(i<=1) {
		System.out.println("Hi Java");
		
		//no reference object
		new Car().name="Vijay";
		new Car().price=20;
		new Car().isAutomatic=false;
		
		//null reference object
		Car t1 = new Car();
		t1 = null;
		t1.name = "name";
		System.out.println(t1.name);//throwing NullPointerException

		}
	}

}
