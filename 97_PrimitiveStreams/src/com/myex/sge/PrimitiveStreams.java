package com.myex.sge;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1,2,3,4,5,6,7};	//it is array of primitive integers
		
		//IntStream intSteam = Stream.of(numbers);
		
		Stream.of(numbers).forEach(System.out::print);
		System.out.println("\n------------------------------------");
		
		/*
		Stream :- with this normal or general Stream we can not find the sum of stream elements or min or max from stream
		elements.
		
		for that either we have to use Primitive stream (IntStream, LongStream, DoubleStream) or convert general stream
		to Primitive Stream using mapToInt() or mapToLong() or MapToDouble().
		*/
		
		//In just below code we will see how to convert general stream into primitive stream. 
		int sum = IntStream.of(numbers).sum();
		System.out.println(sum);
		
		int min = IntStream.of(numbers).min().getAsInt();
		System.out.println(min);
		
		int max = IntStream.of(numbers).max().getAsInt();
		System.out.println(max);
		
		System.out.println("\n------------------------------------");
		
		IntStream.of(numbers).forEach(System.out::print);
		
		System.out.println("\n------------------------------------");
		
		Arrays.stream(numbers).forEach(System.out::print);		//here Arrays.stream() return the IntStream
		
		System.out.println("\n------------------------------------");
		
		
	}
}

/*
Java 8 stream framework has a generic Stream<T> for objects as elements, 
and three primitive streams IntStream, LongStream, DoubleStream for the main three primitives. 
If you work with primitives, use one of these.
 */