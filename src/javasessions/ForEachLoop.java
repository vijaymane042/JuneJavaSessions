package javasessions;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int i[] = new int [4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		for( int k=0; k<i.length; k++)
		{
			System.out.println(i[k]);
		}
		System.out.println("-----------");
		//for each:
		for( int e : i)
		{
			System.out.println(e);
		}
		System.out.println("-----");
		double d[] = new double[3];
		d[0] = 12.12;
		d[1] = 13.13;
		d[2] = 14.14;
		for ( double e : d)
		{
			System.out.println(e);
		}
		
		System.out.println("-----");
		char c[] = new char[3];
		c[0] = 'v';
		c[1] = 'i';
		c[2] = 'j';
		for ( char e : c)
		{
			System.out.println(e);
		}

	}

}
