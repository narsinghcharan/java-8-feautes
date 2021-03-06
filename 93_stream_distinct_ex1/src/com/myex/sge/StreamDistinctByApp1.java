package com.myex.sge;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDistinctByApp1 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,1,2,8,9,3,4);
		
		List<Integer> distinctNumbers1 = numbers.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctNumbers1);
		
		
		Set<Integer> distinctNumbers2 = numbers.stream().collect(Collectors.toSet());
		System.out.println(distinctNumbers2);
	}
}
