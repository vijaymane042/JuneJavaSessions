package oop_inheritance;

public class BMW extends Car {
	//Method overriding-Poly + Morphism(RunTime/dynamic)
	//When you have a method in parent class and the same method is in child class:
	//with the same method name
	//same number of parameters with the same sequence
	//same return types
	//private method can not overridden
	//Final: to prevent method overriding--method final
	//to prevent inheritance-- class final
	//to prevent constant data
	int speed = 200;
	//static int wheels =4;
	@Override
	public void start() {
		System.out.println("Its BMW class method : start: BMW is start");
		
	}
	
	public void bmwEngine() {
		System.out.println("Its BMW class method: bmwEngine: engine is start");
	}
	
	public void carStop()
	{
		System.out.println("Its BMW class method: carStop: BMW is stop");
	}
    //Method hiding
	public static void billing() {
		System.out.println("BMW--billing");
	}
	
}
