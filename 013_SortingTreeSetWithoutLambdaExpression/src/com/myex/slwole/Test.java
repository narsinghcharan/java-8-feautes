package com.myex.slwole;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Set<Integer> s = new TreeSet<Integer>(new MyComparator());
		
		s.add(5);
		s.add(2);
		s.add(9);
		s.add(6);
		s.add(4);
		
		System.out.println("Sort Method : " + s);
		
	}
}
