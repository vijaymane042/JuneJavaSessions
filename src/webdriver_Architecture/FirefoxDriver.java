package webdriver_Architecture;

public class FirefoxDriver implements WebDriver{

	public FirefoxDriver() {
		System.out.println("Lounch firefox browser-----");
	}

	@Override
	public void get(String url) {
		System.out.println("browser URl :" +url);
	}

	@Override
	public String getTitle() {
		System.out.println("browser page title is :" );
		return "My Title";
	}

	@Override
	public void click(String element) {
		System.out.println(" click on button :" +element);
		
	}

	@Override
	public void sendKeys(String element, String value) {

         System.out.println(" Email ID is :" + element + " Password is :"+value);
		
	}

	@Override
	public void closePage() {
		System.out.println(" browser --closed");
	}
	
		
	}


