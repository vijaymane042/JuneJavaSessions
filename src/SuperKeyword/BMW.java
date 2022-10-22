package SuperKeyword;

public class BMW extends Car {

	int minSpeed = 99;
      
	public BMW()
	{
	    super(10,"Vijay");
		System.out.println("BMW default constructor");
	}
	public void displaySpeed() {
		System.out.println("Minimum speed of BMW is :" + minSpeed);//99
		System.out.println("Minimum speed of car is :" + super.minSpeed);//155
	}

	@Override
	public void getMileage() {
		System.out.println("BMW mileage is :42");
		super.getMileage();
	}
}
