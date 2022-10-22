package javasessions;

public class Browser {
	// WAF: lunch a browser:
	// parameter : browser name
	// return: boolean: true/false

	public boolean lounchBrowser(String bName) {

		System.out.println("lounching browser :" + bName);
        switch (bName.toLowerCase()) {
		case "chrome":
			System.out.println("chrome is lounched...");
			return true;
		case "firefox":
			System.out.println("firefox is lounched...");
			return true;
		case "safari":
			System.out.println("safari is lounched...");
			return true;

		default:
			System.out.println("browser is invalid :"+bName);
			return false;
		}
	}

	public static void main(String[] args) {

		Browser b = new Browser();
		boolean flag=b.lounchBrowser("CHROME");
		System.out.println(flag);
	}

}
