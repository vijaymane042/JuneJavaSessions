package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;

public class TryCatchBlock {

	String name;
	public static void main(String[] args) {
	int a=9;
	int b=0;
	//Thread.sleep(1000);//checked exception
	//File file1 = new File("test.png");
	//FileInputStream ip = new FileInputStream(file1);////checked exception
	
      System.out.println("hello");
      try
      {
    	  TryCatchBlock bt =new TryCatchBlock();
    	  bt =null;
    	  bt.name ="Vijay";//null pointer EX
    	  //int c= a/b;// divide by zero EX
    	  System.out.println("111111");
    	  
      }
      catch (ArithmeticException e)
      {
    	  System.out.println("Hi AE is comming...");
    	  e.printStackTrace();
    	
      }catch(NullPointerException e)
      {
    	  System.out.println("Hi NE is comming...");
    	  e.printStackTrace();
      }catch(Error e) {
    	  System.out.println("NE is commming...");
      }
     
	}

}
