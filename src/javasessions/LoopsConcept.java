package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1. while loop
		//use cases of while loop->
		// 1. when number of iterations are not fixed:
		// 2. page loading time
		// 3. number of web elements on the page ---10, 20, 30
		// 4. web table-pagination-->1 2 3 4 5..next
		int m=10;
		while(m>=0) {
			System.out.println(m);
			m--;
		}
		int i=0;
		while(i<=10) {
			System.out.println(i);
			//i++;
			//++i;
			i= i + 2;
		}
		
		int a=0;
		while(a<=0) {
			System.out.println("hi");
			break;
		}
		while(true) {
			System.out.println("hi");
			break;
			
		}
		//2. do while loop
		//check the condition at least once before checking the condition
		int count=0;
		do {
			System.out.println(count);
			count++;
		}while(count<=10);
		
		//3. for loop
		//use cases of for loop->
		// 1. when number of iterations are fixed:
		// 2. 
		int j=0;
		for(;j<=10;j++)
		{
			System.out.println(j);
		}
		
//		for(;;) {
//			System.out.println("hi");
//			break;
//		}
//		for(int i=10;i>=0;i--) {
//			System.out.println(i);
//		}
		
		
		for(short k=0;k<=10;k++)
		{
			System.out.println(k);
		}
		for(double d=0.0;d<=10.0;d++)
		{
			System.out.println(d);
		}
		for(char k='a';k<='z';k++)
		{
			System.out.println(k+":"+(int)k);
		}
		//for each loop
		//
		
	}

}
