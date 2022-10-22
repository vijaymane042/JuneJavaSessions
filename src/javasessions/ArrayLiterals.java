package javasessions;

public class ArrayLiterals {

	public static void main(String[] args) {
		//ArrayLiterals: static array
		int i[] = {10, 20, 30, 40};
		System.out.println(i.length);
		System.out.println("hi  " +(i.length-1));
		System.out.println("li " +0);
		
		for (int e: i) {
			System.out.println(e);
		}
		System.out.println("------------");
		//String array literal:
		String students [] = {"Yogesh", "Ram", "kishan"};
		System.out.println(students.length);
		
		for (String e : students) {
			System.out.println(e);
			if(e.equals("Ram")) {
				System.out.println("---100 marks");
				break;
			}
		}
		System.out.println("------------");
		//object literals
		
		Object o[] = { 12, 12.12, "Vijay", 'M', true};
		
		System.out.println(o.length);
		
		for (Object e : o) {
			System.out.println(e);
		}
		

	}

}
