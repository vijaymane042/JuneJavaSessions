package AccessModifier2;

import AccessModifier1.Car;

public class VehicleDiffPkgNonSubClass {

public static void main(String[] args) {
		
		Car c = new Car();
		c.pblicName ="Public Different PKG non- sub class";
		
		c.checkPublicMethod();
	}
	
}
