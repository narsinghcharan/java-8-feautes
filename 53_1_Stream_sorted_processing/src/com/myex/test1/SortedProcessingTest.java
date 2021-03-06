/*
sort the elements of the collection and create new collection. 
*/
package com.myex.test1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedProcessingTest {
	public static void main(String[] args){
	
		List<Integer> l1 = new ArrayList<Integer>();
	
		l1.add(10);
		l1.add(4);
		l1.add(8);
		l1.add(2);
		l1.add(5);
	
		System.out.println(l1);
	
		//default natural sorting order
		List<Integer> l2 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println("Default Natural Sorting Order : " + l2);
		
		//in reverse order
		List<Integer> l3 = l1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Reverse Sorting Order : " + l3);
	}
}
