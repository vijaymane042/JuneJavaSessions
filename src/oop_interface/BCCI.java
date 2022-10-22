package oop_interface;

public interface BCCI extends ICC{
    //abstract method : having no method body
	//can not create the object of interface
	//100% abstraction
	
	int board = 1;
	static final int teams = 10;
	//interface variables by default Static and final
	public void iplLeague();
	public void ranajiTrophy();
	public void otherLeague();
	public void womensleague();
	
	//Method overloading
	public void iplTeam();
	public void iplTeam(String MI);
	public int iplTeam(String RCB, int a);
	
	//after JDK 1.8
	//two major changes:
	//1. can have a static method with method body
	public static void committe() {
		System.out.println("BCCI committe");
	}
	
	//2. Default 
	//can have a default method
	default void coach() {
		System.out.println("BCCI coach committe");
	}
}
