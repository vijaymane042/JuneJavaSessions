package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//ArrayList- default class
		//create the object of the ArrayList : with new keyword
		//Virtual capacity of ArrayList is always VC=10
		//Initial Physical capacity of ArrayList is always PC=0
		ArrayList ar = new ArrayList();//by default Virtual Capacity=10
		System.out.println(ar.size());//0
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());//2
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());//4
		
		System.out.println(ar.get(0));
		//System.out.println(ar.get(5));
		
		//to print all the values of arraylist: for loop/for each loop
		
		for(int i=0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
			
			
	}

}
