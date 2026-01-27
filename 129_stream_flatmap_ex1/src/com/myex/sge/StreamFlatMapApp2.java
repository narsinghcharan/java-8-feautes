package com.myex.sge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapApp2 {

	public static void main(String[] args) {


		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			l1.add(i);
		}
		System.out.println("Before using map() method:" + l1);
		
		List<Integer> l2 = l1.stream().flatMap(i -> {
			if(i%2 != 0) {
				return Stream.empty();
			} else {
				return Stream.of(i);
			}
		}).collect(Collectors.toList());
		
		System.out.println("After using flatMap() method:"+l2); 

		List<Integer> l3=l1.stream().flatMap(i-> { 
			if (i%2 !=0) 
				return Stream.empty();
			else 
				return Stream.of(i,i*i);
		}).collect(Collectors.toList());
		
		System.out.println("After using flatMap() method:"+l3); 
		
	}
}
