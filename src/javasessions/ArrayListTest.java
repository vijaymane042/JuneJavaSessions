package javasessions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(30);
		arr.add(70);
		arr.add(40);
		Collections.sort(arr);
		System.out.println(arr);
		arr.remove(1);
		System.out.println(arr);
		arr.add(1, 12);
		System.out.println(arr);
		// System.out.println(arr.indexOf(20));
		int as1[] = { 1, 2, 3 };
		System.out.println(Arrays.toString(as1));
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(80);
		arr1.add(60);
		arr1.add(20);
		arr1.add(50);

		arr1.addAll(arr1);
		Collections.sort(arr1);
		System.out.println(arr1);

		ArrayList<String> str = new ArrayList<>();
		str.add("TDD");
		str.add("DLL");
		str.add("BDD");
		str.add("POM");
		Collections.sort(str);
		System.out.println(str);

		Collections.swap(str, 1, 3);
		System.out.println(str);

	}

}
