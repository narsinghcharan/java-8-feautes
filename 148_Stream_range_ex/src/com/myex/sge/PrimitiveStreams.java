package com.myex.sge;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimitiveStreams {

	public static void main(String[] args) {

		IntStream.range(1, 10).forEach(System.out::println);
		System.out.println("---------------------");
		
		String s = IntStream.range(1, 10).mapToObj(n -> String.valueOf(n)).collect(Collectors.joining(","));
		System.out.println(s);
		System.out.println("---------------------");
		
		
		int sum1 = IntStream.range(1, 10).sum();		//here the end range i.e. 10 is exclusive
		System.out.println(sum1);
		
		System.out.println("---------------------");
		
		int sum2 = IntStream.rangeClosed(1, 10).sum();		//here the end range i.e. 10 is inclusive
		System.out.println(sum2);
		
		System.out.println("---------------------");
		
		int[] integers = new int[] {20, 98, 12, 7, 35};
		int min = Arrays.stream(integers)
		  .min()
		  .getAsInt();
		System.out.println(min);
	}
}

/*
 * we can use Stream.iterate() to create stream values on demand, so called
 * infinite stream.
 * 
 */