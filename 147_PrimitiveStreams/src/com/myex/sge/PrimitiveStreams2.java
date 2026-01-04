package com.myex.sge;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams2 {

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
		

		//will result in a compilation error. This is because IntStream, which deals with primitive int values, does not support the collect(Collectors.toList()) method directly.
		//IntStream.rangeClosed(3, 10).filter(i -> i % 2 == 0).collect(Collectors.toList());
		//below is the correct code 
		
		IntStream.rangeClosed(3, 10).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
		//or we can do like below
		
		IntStream.rangeClosed(3, 10).filter(i -> i % 2 == 0).mapToObj(Integer::valueOf).collect(Collectors.toList());
		
		
		//If you prefer to work with primitive int values and avoid boxing, you can collect the results into an array instead:
		int[] evenNumbersArray = IntStream.rangeClosed(3, 10).filter(i -> i % 2 == 0).toArray();
		
	}
}

/*
Java 8 stream framework has a generic Stream<T> for objects as elements, 
and three primitive streams IntStream, LongStream, DoubleStream for the main three primitives. 
If you work with primitives, use one of these.
 */