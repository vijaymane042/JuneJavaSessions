package exceptionHandling;

public class FinnallyBlock {

	public static int getMarks(String sdName) {
		System.out.println("Student gettingmarks :" + sdName);
		if (sdName == "Vijay") 
		{
			try {
				int b = 9 / 3;
				System.exit(0);
				return 10;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming");
				return 100;
			}
			finally {
				System.out.println("It's finally block..");
				//return 55;
			}
			//return 75;

		} else if (sdName == "Jay") {
			System.out.println("Jay");
			return 90;
		} else if (sdName == "Raj") {
			System.out.println("Jay");
			return 80;
		}else {
			System.out.println("Student not found");
			return -1;
		}
	}

	public static void main(String[] args) {

		int value=getMarks("Vijay");
		System.out.println(value);
//		try {
//			System.out.println("hi");
//			int a = 9 / 0;
//		} catch (ArithmeticException e) {
//			System.out.println("hello");
//			e.printStackTrace();
//		} finally {
//			System.out.println("I'm finally block ");
//		}
	}

}
