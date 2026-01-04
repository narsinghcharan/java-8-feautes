package com.myex.slwole;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(5);
		l.add(2);
		l.add(9);
		l.add(6);
		l.add(4);
		
		System.out.println("Before Sort Method : " + l);
		
		Collections.sort(l);		// sort in default natural sorting order.
		
		System.out.println("After Sort Method for ascending order: " + l);
		
	//	Collections.sort( l , (o1,o2) -> { return (o1>o2) ? -1 : (o1<o2) ? 1 : 0;} );
		
		//Collections.sort( l , (o1,o2) -> (o1>o2) ? -1 : (o1<o2) ? 1 : 0 );		//descending order
		//or
		Collections.sort(l, (i1, i2) -> -(i1-i2));			//descending order
		
		
		System.out.println("After Sort Method for descending order: " + l);

	}
}
