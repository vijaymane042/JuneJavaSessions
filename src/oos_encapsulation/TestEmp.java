package oos_encapsulation;

public class TestEmp {

	public static void main(String[] args) {
		//CRUD
		Employee e = new Employee("Vijay",30,true);
		//GET-retrieve
	    System.out.println(e.getName());
	    System.out.println(e.getAge());
	    System.out.println(e.isPerm());
	    
	    //SET
	    e.setName("Yuvi");
	    e.setAge(25);
	    
	    //GET
	    System.out.println(e.getName());
	    System.out.println(e.getAge());
	    System.out.println(e.isPerm());
	    
	    e.setPerm(false);
	    System.out.println(e.getName());
	    System.out.println(e.getAge());
	    System.out.println(e.isPerm());
//		e.setName("Vijay");
//		e.setAge(30);
//		e.setPerm(true);
//		
//		System.out.println(e.getName() + " " + e.getAge()+" "+ e.isPerm());
	
	
	}

}
