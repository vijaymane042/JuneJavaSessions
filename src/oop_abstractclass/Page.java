package oop_abstractclass;

public abstract class Page {
	
	//can not create the object of abstract class.
	//can have abstract + non abstract methods in abstract class.
	//can we create the object object of abstract class? ans- YES
	//but this will called when you create the object of child class..
	
	//in abstract class:
	//1. No(zero) abstract method...yes       0%   abstraction
	//2. only abstract method...yes           100% abstraction
	//3. Abstract + Non Abstract method...yes Partial abstraction
	
	//Interface
	//100% abstraction
	
	public Page() {
		System.out.println("Page....defaoult constructor");
		
	}
	public Page(int i) {
		
		System.out.println("Page....para constructor: " +i );
		
	}
   public abstract void title();
   public abstract void url();
   
   public void timeOut() {
	   System.out.println("Page---- Time out : 1 sec");
   }
   public final void displayLogo() {
	   System.out.println("Page----this is display logo");
   }
}
