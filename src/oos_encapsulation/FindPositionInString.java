package oos_encapsulation;



public class FindPositionInString {

  
 
   



	public static void main(String[] args) {
	 
		  String a = "Welcome to Naveen Automation Labs";
		  char sentence[] = a.toCharArray();		 
		  int counter =0;
		  char element = ' ';
		  for(int i=0;i<sentence.length;i++) 
		  {
			  if(sentence[i]=='e') 
			  {
				  element =sentence[i];
				   counter = counter +1; 
				   if(counter==3) 
				   {	
					   System.out.println(element);
					   System.out.println("Postion of "+element+ " is "+counter);				  
				   }			 
			  }			 
			  
			} 
		  System.out.println("no of "+element+" present in the sentence is " +counter);
	}

}
