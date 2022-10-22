package javasessions;

public class ArraysConcept {

	public static void main(String[] args) {
//Similar type of data will store in array
		//limitations
		//1. Similar type of data only: to overcome this problem we have to use dynamic array: ArrayList or object array
		//2. size is fixed: static array: to overcome this problem we have to use dynamic array: ArrayList
//1. int array
		int i1[] = {1,2,3,4};
		int i2[] = new int[] {1,2,3,4};
		int i [] = new int[4];//array initialization
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		i[3] = 4;
		
		System.out.println(i[0]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException

		int len = i.length;
		int lowestIndex = 0;
		int highestIndex = len - 1;
		System.out.println("lowestIndex: "+ lowestIndex);
		System.out.println("highestIndex: "+ highestIndex);
		System.out.println("length: " + len);
	
		for(int k=0; k<i.length; k++)
		{
			System.out.println(i[k]);
		}
		
		System.out.println("-----------");
		//to print array in reverse order
		for(int j=i.length-1;j>=0;j--) {
			System.out.println(i[j]);
		}
		
		//2. double
		double a[] = new double [2];
		a[0] = 10.20;
		a[1] = 20.20;
		System.out.println(a[0]);
		
		//char
		char c [] = new char[2];
		c[0] = 'a';
		c[1] = 'b';
		System.out.println(c[0]);
		System.out.println(c[0]+c[1]);
		
		
	}

}
