package builderPattern;

public class Ecom {

	public Ecom doLogin() {
		System.out.println("Login to app");
		return this;
	}

	public Ecom doLogin(String un, String pwd) {
		System.out.println("Login to app :" + un + ":" + pwd);
		return this;
	}

	public Ecom serach() {
		System.out.println("serach with all product");
		return this;
	}

	public Ecom serach(String name) {
		System.out.println("Search with :" + name);
		return this;
	}

	public Ecom addToCart(String name) {
		System.out.println("add to cart :" + name);
		return this;
	}

	public Ecom makePayment(String cc, int cvv) {
		System.out.println("make payment :" + cc + ":" + cvv);
		return this;
	}

	public Ecom makePayment(String cc, int cvv, int otp) {
		System.out.println("make payment :" + cc + ":" + cvv + ":" + otp);
		return this;
	}

	public Ecom makePayment(String upi) {
		System.out.println("make payment :" + upi);
		return this;
	}
	
	public Ecom generateOrder() {
		System.out.println("Order gets placed successfully :"+ 7755);
		return this;
	}
	
	public Ecom logout() {
		System.out.println("Logout successfully!!!");
		return this;
	}
	
}
