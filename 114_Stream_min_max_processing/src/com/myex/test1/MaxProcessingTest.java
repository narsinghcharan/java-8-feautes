/*
sort the elements of the collection in descending order and create new collection. 
*/
package com.myex.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaxProcessingTest {
	public static void main(String[] args){
	
		List<Integer> l1 = new ArrayList<Integer>();
	
		l1.add(10);
		l1.add(4);
		l1.add(8);
		l1.add(2);
		l1.add(5);
	
		System.out.println(l1);
	
	//	List<Integer> l2 = l1.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
	//	System.out.println("Default Natural Sorting Order : " + l2);
		
		List<Integer> l2 = l1.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Descending Sorting Order : " + l2);
		
	}
}
