package javasessions;

public class ApplicationSystem {

	String name;
	int pages;
	String url;
	public ApplicationSystem(String name, int pages, String url) {
		this.name = name;
		this.pages = pages;
		this.url = url;
	}
	
	public int getPageCount(String appName) {
		switch (appName) {
		case "amazon":
			System.out.println("Welcome to amazon");
			return this.pages;
		case "flipkart":
			System.out.println("Welcome to flipkart");
			return this.pages;
		case "myntra":
			System.out.println("Welcome to myntra");
			return this.pages;

		default:
			System.out.println("app not found");
			return -1;
		}
		
	}
}
