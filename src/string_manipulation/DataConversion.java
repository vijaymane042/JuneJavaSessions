package string_manipulation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DataConversion {

	public static void main(String[] args) {
		
		String s = "100";
		System.out.println(s+10);
		//wrapper class
		//Integer class
		//1. String to Integer
		int s1 =Integer.parseInt(s);
		System.out.println(s1+10);
		
		//String s2 = "100A";
		//System.out.println(s2+20);
		//int y =Integer.parseInt(s2);//NumberFormatException
		//System.out.println(y);
		
		//2. String to double
		String s3="12.12";
		System.out.println(s3+30);
		double d = Double.parseDouble(s3);
		System.out.println(d+20);
		
		//3. Int to String
		int pop =100 + 10 - 60;
		System.out.println(pop+20);
		String s4=String.valueOf(pop);
		System.out.println(s4+30);
		
		//4. double to string
		double ss = 56.55;
		String s5 = String.valueOf(ss);
		System.out.println(s5+56);
		
		//5. String to boolean
		String  s6= "false";
		boolean b = Boolean.parseBoolean(s6);
		System.out.println(b);
		if(Boolean.parseBoolean(s6))
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("fail");
		}
		
		//6. Boolean to string
		boolean b1 = true;
		String s7 = String.valueOf(b1);
		System.out.println(s7+77);
		
		//Split function
		String s8 = "Java_OPPS_Python_DotNet_SQL";
		String s9[] = s8.split("_");
		System.out.println(s9[1]);
		System.out.println(s9.length);
		
		String s10 = "XxXIndiaXxIsxXxCountryXxAndxX";
		String s11[]=s10.split("Xx");
		System.out.println(s11[0].length());
		System.out.println(s11.length);
		System.out.println(Arrays.toString(s11));
		for (String s12 : s11) {
			System.out.println(s12);	
		}
		
		String s13 = "AAdBBdCCdEEdFFdGG";
		String s14[]=s13.split("d");
		System.out.println(Arrays.toString(s14));
		
		String name ="Vijay:Vijay:Vijay:";
		String data[] =name.split(":");
		for (String n : data) {
			System.out.println(n);
		}
		
		String s16 ="A B   C D E";
		String s17[]= s16.split(" ");
		System.out.println(Arrays.toString(s17));
		String s18 ="A B    C    D    E";
		String s19[]= s18.split("\\s+");
		System.out.println(Arrays.toString(s19));
	}

}
