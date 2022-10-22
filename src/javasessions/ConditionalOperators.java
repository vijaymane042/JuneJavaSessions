package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {
	
    int a = 10;
    int b = 20;
    if(a <= b)
    {
    	System.out.println("a is greater");
    }
    else
    {
    	System.out.println("b is small");
    }
    //
    if(20==30)//Dead code
    {
    	System.err.println(" hii");
    }
    else
    {
    	System.out.println("bye");
    }
    
    //
    if(true)
    {
    	System.out.println("selenium");
    }
    else
    {//Dead code
    	System.out.println("cypress");
    }
    
    //
    boolean flag= false;
    if(flag)
    {
    	System.out.println("YES");
    }
    else
    {
    	System.out.println("No");
    }
    
    //nested if else
//     int marks= 101;
//     if(marks <= 100) {
//    	 System.out.println("marks are less than 100");
//    	 if(marks>=35) {
//    		 System.out.println("PASS");
//    		 if(marks>=75) {
//    			 System.out.println("First class");
//    		 }else {
//    			 System.out.println("second class");
//    		 }
//    	 }else {
//    		 System.out.println("Fail");
//    	 }
//    	 
//     }else {
//    	 System.out.println("Invalid marks");
//     }
     
     String browser ="chrome";
 	if(browser.equals("chrome"))
 	{
 		System.out.println("lonching the chrome");
 	}
 	else if(browser.equals("IE")){
 		System.out.println("lonching the IE");
 	}else {
 		System.out.println("invalid browser: "+browser);
 	}
 	
	
	}

}
