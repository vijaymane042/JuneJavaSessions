package javasessions;

public class AppTest {

	public static void main(String[] args) {
	ApplicationSystem app = new ApplicationSystem("amazon", 51, "www.amazon.com");
	int a=app.getPageCount(app.name);
	System.out.println(app.name+ " " +a + " "+app.url);
	
	ApplicationSystem app1 = new ApplicationSystem("flipkart", 50, "www.flipkart.com");
	int b=app1.getPageCount(app1.name);
	System.out.println(app1.name+ " " +a + " "+app1.url);
    
	
	}

}
