package com.myex.slwole;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Set<Integer> l = new TreeSet<Integer>((o1,o2) -> o1>o2 ? -1 : o1<o2 ? 1 : 0);
		
		l.add(5);
		l.add(2);
		l.add(9);
		l.add(6);
		l.add(4);
		
		System.out.println("Sort Method : " + l);
		
	/*	Collections.sort(l);		// sort in default natural sorting order.
		
		System.out.println("After Sort Method for ascending order: " + l);
		
		Collections.sort(l, new MyComparator());
		
		System.out.println("After Sort Method for descending order: " + l);
	*/
	}
}
