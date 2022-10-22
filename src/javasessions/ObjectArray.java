package javasessions;

public class ObjectArray {

	public static void main(String[] args) {
		//Object static array:
		Object emp[]= new Object[5];
		
        emp[0] = "SQL";
        emp[1] = 11;
        emp[2] = 11.22;
        emp[3] = 'V';
        emp[4] = true;
        //emp[5] = 12232111;//ArrayIndexOutOfBoundsException
        
        System.out.println(emp[0]);
        for(int i=0; i<emp.length; i++)
        {
        	System.out.println(emp[i]);
        }
        System.out.println("-----------");
		//for each:
		for( Object vijay : emp)
		{
			System.out.println(vijay);
			if(vijay.equals("SQL"))
			{
			System.out.println(vijay+ "hiiiii");
			break;
			}
		}
	}

}
