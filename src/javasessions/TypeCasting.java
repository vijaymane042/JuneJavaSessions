package javasessions;

public class TypeCasting {

	public static void main(String[] args) {
		//1. widening TypeCasting:
		//Auto conversion of lower data types to higher data types
		
		byte a = 10;
		short p = a;
		int i = p;
		long l = i;
	 System.out.println(p);
	 System.out.println(i);
	 
	 //2. Narrowing :
	 //conversion of higher data types to lower data types
	 int a1 = 1;
	 short a2 = (short)a1;
	 byte a3 = (byte)a2;
	 long a4 = (long)a3;
	 System.out.println(a2);
     System.out.println(a4);
     
     byte m =110;
     byte n =114;
     int a5 = m + n;
     byte a6 = (byte)(m+n);
     
     System.out.println(a5);
     System.out.println(a6);
     
     char c = 97;
     char d = 'b';
     System.out.println((int)d);    		 
     System.out.println(c + 'b');
     
	}

}
