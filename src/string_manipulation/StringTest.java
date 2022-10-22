package string_manipulation;

public class StringTest {

	public static void main(String[] args) {
		String x = "Selenium automation";//String literal --1 object will be created in String constant pool
		String y=x.concat(" tool");
		System.out.println(x);
		System.out.println(y);
		
		String s1 = "java";//1 object will be created in SCP
		String s2 = "java";//0 object created it will referred by s1
		String s3 = "Java";//1 object will be created in SCP
		
		String s4 = new String("Selenium");//2 objects will be created 1 in SCP and 1 in heap
		String s5 = "Selenium";//0 object created it will referred by s4
		String s6 = "Selenium";//0 object created it will referred by s4
		
		

	}

}
