package SuperKeyword;

public class Car extends Vehical{

	int minSpeed = 155;
	
	public Car()
	{
		System.out.println("Car default constructor");
	}
	public Car(int i)
	{
		System.out.println("Car para constructor :"+ i);
	}
	public Car(int k , String g)
	{
		super("Audiii");
		System.out.println("Car para constructor:" +k +" " +g);
	}
	public void getMileage() 
	{
		System.out.println("Car mileage is 55");
	}
}
