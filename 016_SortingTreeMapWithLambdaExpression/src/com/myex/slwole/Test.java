package com.myex.slwole;

import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		
		Map<Integer,String> l = new TreeMap<Integer,String>((o1,o2) -> o1>o2?-1:o1<o2?1:0);		//descending order
		
		l.put(5,"narsingh");
		l.put(2,"charan");
		l.put(9,"saurya");
		l.put(6,"santosh");
		l.put(4,"nath");
		
		System.out.println("Sort Method : " + l);
		
	/*	Collections.sort(l);		// sort in default natural sorting order.
		
		System.out.println("After Sort Method for ascending order: " + l);
		
		Collections.sort(l, new MyComparator());
		
		System.out.println("After Sort Method for descending order: " + l);
*/
	}
}
