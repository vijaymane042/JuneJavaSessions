package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		String name = null;
		if (name == null)
			try {

				throw new Exception("NODATAFOUNDEXCEPTION");
			} catch (Exception e) {

				System.out.println("hiii");
				e.printStackTrace();
			}
		System.out.println("bye");
	}

}
