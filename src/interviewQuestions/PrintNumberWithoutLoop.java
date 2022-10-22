package interviewQuestions;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {
//Print 1 to 100 Without Using for/while/do-while Loop in Code || Using Recursive
	public static void main(String[] args) {

		//printNumber(1);
		//getNumber(1,100);
		
		//3rd way
		IntStream.range(1,101).forEach(e -> System.out.println(e));
	}
	//1 way
	public static void printNumber(int num)
	{
		if(num <= 100)
		{
			System.out.println(num);
			num++;
			printNumber(num);
		}
	}
	//2 way
	public static void getNumber(int startNum, int endNum)
	{
		if(startNum <= endNum)
		{
			System.out.println(startNum);
			startNum++;
			printNumber(startNum);
		}
	}
	
	

}
