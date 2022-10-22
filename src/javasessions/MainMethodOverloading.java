package javasessions;

public class MainMethodOverloading {
    //command line arguments
	public static void main(String a[]  ) {
	//System.out.println(a.length);//0
	//System.out.println(a[0]);//AIOB Exception
	System.out.println("this is main method");
	}
	public static void main() {
		System.out.println("this is overloaded method");
		}
	
	public static void main(int i) {
		System.out.println("this is 3rd method");
		}
	
//	public static void main(String[] args ) {
//		System.out.println("this is main method");
//		}
}
