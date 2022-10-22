package javasessions;

public class Customers {

	String prodName;
	int quantity;
	String ProdCategory;
	String prodFeatures;
	
	// create constructor with different combinations
	// no default values types of customer
	// where we use method: In business logic
	// where we use constructor: never define/write business logic inside the constructor
	
	
	public Customers(String prodName) {
		this.prodName = prodName;
		System.out.println(prodName);
	}
	
	public Customers(String prodName, int quantity) {	
		this.prodName = prodName;
		this.quantity = quantity;
		System.out.println("Productname= "+prodName+ " " + quantity);
	}
	public Customers(String prodName, int quantity, String prodCategory, String prodFeatures) {
		this.prodName = prodName;
		this.quantity = quantity;
		this.ProdCategory = prodCategory;
		this.prodFeatures = prodFeatures;
		System.out.println(prodName + " " + quantity + " " + prodCategory + " " + prodFeatures);
	}

	public static void main(String[] args) {
	 Customers c = new Customers("Facewash");
	 System.out.println(c.prodName);
	 
	 Customers c1 = new Customers("Dettol", 55);
	 System.out.println("Productname= "+ c1.prodName+ " " + c1.quantity + " " + c1.ProdCategory + " " + c1.prodFeatures);
	 
	 Customers c2 = new Customers("Book", 12, "A3", "LongNoteBook");
	 System.out.println(c2.prodName +" " + c2.quantity + " " + c2.ProdCategory + " " + c2.prodFeatures);
	}

	

}
