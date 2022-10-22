package builderPattern;

public class ShoppingTest {

	public static void main(String[] args) {
		Ecom e = new Ecom();
		e.doLogin("Vijay", "Vijay@21")
		.serach("Java")
		.addToCart("Online session")
		.makePayment("7575 1212 7485 4545", 777, 1245)
		.logout().generateOrder();
		
		
		e.doLogin().serach().makePayment("4562")
		.generateOrder().logout();
		
	
		e.doLogin("vij", "122").logout();
		
		e.logout();
	}

}
