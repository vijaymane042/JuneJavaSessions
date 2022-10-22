package interviewQuestions;

public class DoubleMinValue {
//What is the MIN_Value of Double and Float in #Java
	public static void main(String[] args) {
		
		//Which one is bigger -> Double MIN_VALUE or 0.0d?
		//Which one is bigger -> Double MIN_VALUE or NEGATIVE_INFINITY?
		
		System.out.println(Double.MIN_VALUE);//is a +ve number
		System.out.println(Float.MIN_VALUE);//is a +ve number
		
		System.out.println(Long.MIN_VALUE);//-ve number
		System.out.println(Integer.MIN_VALUE);//-ve number
		
		System.out.println(Math.min(Double.MIN_VALUE,0.0d));
		System.out.println(Math.min(Float.MIN_VALUE,0.0f));
		
		System.out.println(Math.min(Integer.MIN_VALUE,0));
		
		System.out.println(Math.min(Double.MIN_VALUE,Double.NEGATIVE_INFINITY));
		
		

	}

}
