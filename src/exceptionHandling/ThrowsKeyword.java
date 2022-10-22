package exceptionHandling;

public class ThrowsKeyword {

	public static void addToCart() {
		System.out.println("addToCart method");
		doPayment();
	}

	public static void generateOrderID(int num) throws ArithmeticException {
		int a = 9 / num;
		System.out.println("generateOrderID");
	}

	public static void doPayment() {
		System.out.println("dopayment");
		try {
			generateOrderID(0);
		} catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
		System.out.println("bye");
	}

	public static void main(String[] args) {

		addToCart();
	}

}
