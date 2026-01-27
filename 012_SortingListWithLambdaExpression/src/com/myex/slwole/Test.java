package com.myex.slwole;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(5);
		l.add(2);
		l.add(9);
		l.add(6);
		l.add(4);
		
		List<Integer> l1 = new ArrayList<>(l);
		
		System.out.println("Before Sort Method : " + l);
		
		Collections.sort(l);		// sort in default natural sorting order.	ASC-order
		
		System.out.println("After Sort Method for ascending order: " + l);
		
	//	Collections.sort( l , (o1,o2) -> { return (o1>o2) ? -1 : (o1<o2) ? 1 : 0;} );
		
		//Collections.sort( l , (o1,o2) -> (o1>o2) ? -1 : (o1<o2) ? 1 : 0 );		//descending order
		//or
		Collections.sort(l, (i1, i2) -> -(i1-i2));			//descending order
		
		System.out.println("After Sort Method for descending order: " + l);

		//we can also sort using stream.
		System.out.println("-------------------------------------");
		
		System.out.println(l1);
		List<Integer> l2 = l1.stream().sorted().collect(Collectors.toList());		// sort in default natural sorting order. ASC-order
		System.out.println(l2);
		
		List<Integer> l3 = l1.stream().sorted((i1, i2) -> -(i1-i2)).collect(Collectors.toList());		// custom sorting order. DESC-order
		System.out.println(l3);
		
		
	}
}
