package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		 
		String x = "Vijay";
		String y = "Mane";
		
		double d1 = 10.10;
		double d2 = 20.20;
		
		char c1 = 'a';
		char c2 = 'b';
		
		System.out.println(x+ " "+y);
		System.out.println(x+ ' '+y);
		System.out.println(x+y);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		System.out.println("My name is: "+x);
		System.out.println(a+b+x+y+a+b);
		System.out.println(x+y+d1+d2);
	System.out.println(x+y+(c1+c2));

	}

}
