package interviewQuestions;

public class LongNumbers {
// Output when print a long number with L and without L suffix in #Java?
	public static void main(String[] args) {
    long longNumberWithoutL = 100*60*60*24*365;
    long longNumberWithL = 100*60*60*24*365L;
    System.out.println(longNumberWithoutL);
    System.out.println(longNumberWithL);
    

	}

}
