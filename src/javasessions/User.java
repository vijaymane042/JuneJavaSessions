package javasessions;

public class User {
	String name ="Vijay";
	public static void main(String[] args) {
      
		
		
		
		User u1= new User();
	    u1.name ="Vijay";
		User u2= new User();
	    u2.name ="jaya";
		User u3= new User();
	    u3.name ="yogesh";
	    
		System.out.println(u1.name);//Vijay
		System.out.println(u2.name);//jaya
		System.out.println(u3.name);//yogesh
        System.out.println("---------");
		u1 = u2;//u1=jaya
		
		System.out.println(u1.name);//jaya
		System.out.println(u2.name);//jaya
		System.out.println(u3.name);//yogesh
		System.out.println("---------");
        u2 = u3;//u2=yogesh
		
		System.out.println(u1.name);//vijay
		System.out.println(u2.name);//yogesh
		System.out.println(u3.name);//yogesh
		System.out.println("---------");
		u3 = u1;//u3=jaya
		
		System.out.println(u1.name);//vijay
		System.out.println(u2.name);//jaya
		System.out.println(u3.name);//vijay
		System.out.println("---------");
		u2 = u3;//u1=jaya
		
		System.out.println(u1.name);//jaya
		System.out.println(u2.name);//jaya
		System.out.println(u3.name);//jaya
		System.out.println("---------");
		u1 = u2;//u1=jaya
		
		System.out.println(u1.name);//jaya
		System.out.println(u2.name);//jaya
		System.out.println(u3.name);//jaya
		
		
		
	}

}
