package javasessions;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		//ArrayList with Generic:
		
		ArrayList<Integer> markList =new ArrayList<Integer>();
		
		markList.add(10);
		markList.add(11);
		System.out.println(markList);
		ArrayList<Double> price = new ArrayList<Double>();
		
		price.add(11.22);
		price.add(22.22);
		
		ArrayList<String> empName=new ArrayList<String>();
		
		empName.add("Vijay");
		empName.add("10");
		//for index
		//print reverse array
		System.out.println(empName.size());
		for(int i=empName.size()-1; i>=0;i--) {
			System.out.println(empName.get(i));
		}
		//for each
		System.out.println("-----");
		for(String s: empName) {
			System.out.println(s);
		}
		System.out.println("------------");
		//design a list of employee data
		//name(String), age(int), salary(double), isPerm(boolean), gender(char)
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Mike");
		empData.add(50);
		empData.add(7777.77);
		empData.add(true);
		empData.add('f');
		
		for(Object o:empData) {
			System.out.println(o);{
				if(o.equals(true)) {
					System.out.println("PASS");
				
				}
				
			}
		}

	}

}
