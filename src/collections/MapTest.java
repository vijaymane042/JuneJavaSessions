package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {

		Map<String, Integer> studentDetails = new HashMap<String, Integer>();//getting result as per hash code/getting non sorted list or without sorted list
		System.out.println("--------------HashMap-------------");
		studentDetails.put("ABC", 1);
		studentDetails.put("jack", 1);
		studentDetails.put("BBB", 2);
		studentDetails.put("CCC", 3);
		
		System.out.println(studentDetails.get("ABC"));
		
		studentDetails.forEach((k,v) -> System.out.println(k +":"+v));
		
        HashMap<String, Integer> staffDetails = new LinkedHashMap<String, Integer>();//getting result as per sorted order
        System.out.println("--------------LinkedHashMap-------------");
        staffDetails.put("shon", 1);
        staffDetails.put("binny", 1);
		staffDetails.put("jenny", 2);
		staffDetails.put("gill", 3);
		staffDetails.forEach((k,v) -> System.out.println(k +":"+v));
		
		
        Map<String, Integer> empDetails = new TreeMap<String, Integer>();//getting result as per alphabetically order
        System.out.println("--------------TreeMap-------------");
        empDetails.put("peter", 1);
        empDetails.put("robert", 1);
        empDetails.put("alex", 2);
        empDetails.put("jhon", 3);
        empDetails.forEach((k,v) -> System.out.println(k +":"+v));
		
		
	}

}
