package string_manipulation;

public class StringCompare {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1==s2);//true
		
		String s3 = new String("Java");//s1 and s3 are available in different memory location
		System.out.println(s1==s3);//false
		System.out.println(s2==s3);//false
		
		String s4 = new String("Java");//s4 are created in different memory location
		System.out.println(s3==s4);//false
		
		System.out.println(s3.equals(s4));//true
		System.out.println(s1.equals(s2));
	}

}
