package com.myex.sge;

import java.util.stream.Stream;

public class FibonacciTest {

	public static void main(String[] args) {

		// Stream.iterate(initial value, next value)
		Stream.iterate(new int[] { 0, 1 }, n -> new int[] { n[1], n[0] + n[1] }).limit(10).map(n -> n[0])
				.forEach(System.out::println);
	
	
		//Sum all the Fibonacci values
		
		Integer sum = Stream.iterate(new int[] { 0, 1 }, n -> new int[] { n[1], n[0] + n[1] }).limit(10).map(n -> n[0]).mapToInt(n -> n).sum();
		System.out.println("sum : " + sum);
		//or
		sum = Stream.iterate(new int[] { 0, 1 }, n -> new int[] { n[1], n[0] + n[1] }).limit(10).map(n -> n[0]).mapToInt(Integer::intValue).sum();
		System.out.println("sum : " + sum);
		
	}
}

/*
 * we can use Stream.iterate() to create stream values on demand, so called
 * infinite stream.
 * 
 */