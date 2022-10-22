package javasessions;

public class TimeComplexityConcept {

	public static void main(String[] args) {
		
		//BIG O - TC
		
		int i = 1;//0(1)
		
		int p = 2;
		int total = i + p;
		System.out.println(total);
		//O(N)==>N=1==> O(1)---Constant time
		
		for (int k=0; k<10; k++)
		{
			System.out.println(k);
		}
		//1 + n + n + n ==> 1+3n ==> 3n+1 ==> linear equation
		//3n + 1 ==> 3n ==> O(n)
		
		
		for (int k=0; k<10; k++)
		{
			System.out.println(k);
			System.out.println("hiii");
			System.out.println("bye");
		}
          //1+n+n+n+n+n==>5n+1==>5n==>O(n)
		
		//two loop
		for (int k=0; k<10; k++)
		{
			System.out.println(k);
		}
		for (int k=0; k<10; k++)
		{
			System.out.println(k);
		}
		//3n + 3n ==> 6n ==> O(n)
		
	}

}
