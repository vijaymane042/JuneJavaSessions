package string_manipulation;

public class StringConcept {

	public static void main(String[] args) {
		String str= "Java Selenium automation sessions";//String literals
		System.out.println(str.length());
		System.out.println(str.length()-1);
		System.out.println(str.charAt(0));
		//System.out.println(str.charAt(29));//StringIndexOutOfBoundsException
        //System.out.println(str.charAt(-1));
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf("e", 2));
        System.out.println(str.indexOf("e", str.indexOf("e")+1));

        String mesg = "home welcome";
        if(mesg.indexOf("home")>=0)
        {
        	System.out.println("correct");
        }
        else
        {
        	System.out.println("incorrect");
        }
        
        String s = "        hello     world     ";
        System.out.println(s.trim());
        System.out.println(s.replace(" ",""));
        System.out.println(s.replace(" ","v"));
        
        String browser ="chrome ";
        if(browser.trim().equals("chrome"))
        {
        	System.out.println("Pass");
        }
        else
        {
        	System.out.println("Fail");
        }
           
        String dob="01-01-1992";
        System.out.println(dob.replace("-", "/"));
		
        String h = "Hi this is my selenium script";
        System.out.println(h.toUpperCase());
        System.out.println(h.toLowerCase());
        
        String m1= "chrome";
        String m2= "Chrome";
        System.out.println(m1.equals(m2));
        System.out.println(m1.equalsIgnoreCase(m2));
        
        String m3 ="welcome     to selenium world";
        System.out.println(m3.contains("to"));
        System.out.println(m3.contains("worlds"));
        System.out.println(m3.replaceAll("\\s+", " "));
        
        
	}

}
