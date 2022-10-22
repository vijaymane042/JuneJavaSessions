package oop_interface;

public class Test {

	public static void main(String[] args) {
		IndianCricket ic = new IndianCricket();
		ic.iplLeague();
		ic.ranajiTrophy();
		ic.otherLeague();
		ic.tTwentyWorldCup();
		ic.worldCup();
		ic.testChmpianShip();
		
		System.out.println(BCCI.board);
		int a= BCCI.teams;
		System.out.println(a);
		
		//top casting
		//child class object can be referred by parent interface reference variable 
		//IndianCricket ic1=new BCCI();
		ICC b = new IndianCricket();
		b.worldCup();
		b.tTwentyWorldCup();
		b.testChmpianShip();
		
		
		ausCricket as= new ausCricket();
		as.australiaInternalLeague();
		as.bigBashleague();
		as.otherLeague();
		as.iplLeague();
	
	}

}
