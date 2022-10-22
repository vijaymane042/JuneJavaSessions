package AccessModifier1;

public class TruckNonSubClass {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("Truck Non Sub Class ");
		c.protectdPrice= 7;
		c.pblicName = "Java";
		c.deefalutMileage = 77;
		
		c.checkProtectedMethod();
		c.checkPublicMethod();
		c.checkDefaultMethod();
		
	}

}
