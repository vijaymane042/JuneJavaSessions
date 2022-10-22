package oop_inheritance;

public class Car extends Vehical {
	int speed = 100;
	static int wheels =4;
	public void start() {
		System.out.println("Its car class method: Car is started ");
		
	}
	
	public void carFeature() {
		System.out.println("Its car class feature method: car feature ");
	}
	 //Method hiding
		public static void billing() {
			System.out.println("BMW--billing");
		}
	
}
