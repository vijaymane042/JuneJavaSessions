package string_manipulation;

public class StringBuilderVsStringBuffer {

	public static void main(String[] args) {

      StringBuilder sb = new StringBuilder("Selenium");
      sb.append("World");
      System.out.println(sb);
      System.out.println(sb.reverse());
      
      StringBuffer sb1 = new StringBuffer("Selenium");
      sb1.append("World");
      System.out.println(sb1);
      
      String x = new String("Vijay");
      x.concat("Jay");
      System.out.println(x);
      String y=x.concat("Mane");
      System.out.println(y);
	}
	

}
