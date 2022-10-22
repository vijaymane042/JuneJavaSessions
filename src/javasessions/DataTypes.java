package javasessions;
/**
 * 
 * @author vijay
 * Date: July 16th 2022
 */
public class DataTypes {

	

	 char c;
	 byte b;
	 int i;
	 short s;
	 long l;
	 float f;
	 double d;
	 boolean bb;
	 String str;
	
	public void display() {

		 System.out.println("default value of char is :" +c);
		 System.out.println("default value of byte is :" +b);
		 System.out.println("default value of int is :" +i);
		 System.out.println("default value of short is :" +s);
		 System.out.println("default value of long is :" +l);
		 System.out.println("default value of float is :" +f);
		 System.out.println("default value of double is :" +d);
		 System.out.println("default value of boolean is :" +bb);
		 System.out.println("default value of string is :" +str);
		 

	}
	public static void main(String[] args) {
		DataTypes pc = new DataTypes();
		pc.display();
		// TODO Auto-generated method stub
//data types
//strict data types
//1. Primitive data types: can be used directly inside the memory
//no need to create any object		
  //a.boolean type: boolean (true/false)
  //b.Numeric type:
		//b.1: character type: char
		//b.2: Integral type:
		   //b.2.1: Integer: byte, short, int, long
		   //b.2.2: floating point: float, double
//2. non primitive data types: class, string, array,interface, abstract class
// you have to create particular object of that class	
		//1 byte:
		//size: 1 bytes = 8 = 8 bits
		//rang: -128 to 127
		byte b=1;
		byte t = 065;
		System.out.println(t);//octal number..53
		System.out.println(b);
		//2. short
		//size: 8 bytes = 8*2 = 16 bits
		//rang: -32768 to 32767
		short s=1000;
		System.out.println(s);
		//3. int:
		//size: 4 bytes = 8*4 = 32 bits
		//rang: -2147483648 to 2147483647
		int i=12345;
		System.out.println(i);
		
		//4. long
		//size: 8 bytes = 8*8 = 64 bits
		//rang: -2 64 to 2 64-1
		long num=12354545515121l;
		System.out.println(num);
		//5. floating point
		//size: 4 bytes = 4*8 = 32 bits
		float a= 1.100f;
		float a1=(float)12.25;
		System.out.println(a);
		
		//6. double:
		//size: 8 byte = 8*8 = 64 bits
		double d= 126.5454122121121231234221212121d;
		System.out.println(d);
		
		//7. char
		//size: 2 byte = 16 bits
		//range: a to z = 97 to 122
		//       A to Z = 65 to 90
		//       0 to 9 = 48 to 57
		char c = 'a';//asci value is 97
		char c1 = 'b';//asci value is 98
		char c2 = '1';
		char c3 = '$';
		System.out.println(c);//a
		System.out.println(a+b);// 97+98=195
		System.out.println((int)c);//97
		System.out.println((byte)c);
		System.out.println((short)c);
		System.out.println((long)c);
		System.out.println((int)'a');//97
		
		//8. boolean:
		//size: ~ 1 bit
		boolean b1= true;
		boolean b2= false;
		System.out.println(b1);
		System.out.println(true);
		System.out.println(false);
		
		
		
			
	}

}
