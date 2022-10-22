package interviewQuestions;

public class TestNum {
// Compare Two Integer Numbers (Integer Caching) in #Java
	public static void main(String[] args) {
        //integer caching range is -128 to +127
		//127=both are equal
		//128=both are not equal
		Integer num1 = 128;
		Integer num2 = 128;
		if (num1 == num2) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}
	}

}
