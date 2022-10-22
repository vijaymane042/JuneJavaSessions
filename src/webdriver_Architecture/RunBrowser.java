package webdriver_Architecture;

public class RunBrowser {
     static WebDriver driver;
	public static void main(String[] args) {

		
		String browser ="firefox";
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("please pass the right browser ::::" +browser);
			break;
		}
//      ChromeDriver driver = new ChromeDriver();
      driver.get("www.mytesturl.com");
      String getTtitle=driver.getTitle();
      System.out.println(getTtitle);
      driver.sendKeys("Email ID :", "vijaymane@gmail.com");
      driver.sendKeys("Password is :", "vijaymane");
      driver.click("submitbtn");
      
      
      

	}

}
