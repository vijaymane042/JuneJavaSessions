package interviewQuestions;

import java.util.Arrays;
import java.util.BitSet;

public class PrintNumberWithoutRecursion {
//Print from to 1 to 100 without using any Loop and Recursion || OCJP Question
	public static void main(String[] args) {

//Array fill:
		Object num[] =  new Object[100];
		Arrays.fill(num ,new Object() {
			int count =0;
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
		});
		System.out.println(Arrays.toString(num));
		
		System.out.println("----");
		//2. bitset
		String set = new BitSet() {{set(1,101);}}.toString();
		System.out.append(set, 0, set.length());
	}

	
}
