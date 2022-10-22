package oop_interface;

public class ausCricket  implements ACA,BCCI,ECB {
	//class can extends one class as parent
	//class can implements more y=than one interfaces as parent
	//interface can not  have parents
    //ICC
	@Override
	public void tTwentyWorldCup() {
		System.out.println("AUS----tTwentyWorldCup");
	}

	@Override
	public void worldCup() {
		System.out.println("AUS----worldCup");
	}

	@Override
	public void testChmpianShip() {
		System.out.println("AUS----testChmpianShip");
		
	}

	//IND
	@Override
	public void iplLeague() {
		System.out.println("AUS----iplLeague");
	}

	@Override
	public void ranajiTrophy() {
		System.out.println("AUS----ranajiTrophy");
	}

	@Override
	public void otherLeague() {
		System.out.println("AUS----otherLeague");
	}

	//AUS
	@Override
	public void bigBashleague() {
		System.out.println("AUS----bigBashleague");
	}

	@Override
	public void australiaInternalLeague() {
		System.out.println("AUS----australiaInternalLeague");
	}
	//Individual methods
	static void womensCricket() {
		System.out.println("Womens cricket");
	}
    //ECB
	@Override
	public void theHundredLeague() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void countyCricket() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eglandCricketLeague() {
		// TODO Auto-generated method stub
		
	}
    //common interface method
	@Override
	public void womensleague() {
		// TODO Auto-generated method stub
		
	}

	
	//Method Overriding + Method Overloading
	@Override
	public void iplTeam() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iplTeam(String MI) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int iplTeam(String RCB, int a) {
		return a;
		// TODO Auto-generated method stub
		
	}

	//method hiding
		public static void committe() {
			System.out.println("BCCI commitet");
		}
		
	//can we override default method from interface
		@Override
		public void coach() {
			System.out.println("BCCI coach committe");
		}
}
