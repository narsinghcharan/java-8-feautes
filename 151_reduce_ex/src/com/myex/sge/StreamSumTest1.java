package com.myex.sge;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Summing Numbers with Java Streams
public class StreamSumTest1 {

	public static void main(String[] args) {
		
		//Using Stream.reduce()
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		Integer sum = numbers.stream().reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		
		//Optional<Integer> optional = numbers.stream().reduce((a,b) -> a+b);
		//System.out.println(optional.get());
		
		/*
		sum = numbers.stream().reduce(0, Integer::sum);	//using method reference, using existing java method
		System.out.println(sum);
		
		sum = numbers.stream().reduce(0, ArithmeticUtils::sum);	//Or we can define and use our custom method
		System.out.println(sum);
		
		//Using Stream.collect()
		
		sum = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum);
		
		sum = numbers.stream().collect(Collectors.summingInt(a -> a));
		System.out.println(sum);
		
		
		//Using IntStream.sum()
		
		sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		sum = numbers.stream().mapToInt(a -> a).sum();
		System.out.println(sum);
		
		
		//suppose we have list of double values and first we want to convert it in int then we want the sum of those int values
		
		List<Double> numbersInDouble = Arrays.asList(1.0,2.1,3.2,4.3,5.4);
		
		int sum1 = numbersInDouble.stream().mapToInt(a -> a.intValue()).sum();
		System.out.println(sum1);
		//or
		sum1 = numbersInDouble.stream().mapToInt(Double::intValue).sum();
		System.out.println(sum1);
		
		//now first we want to sum the double values then we want in int data type
		
		sum1 = (int) numbersInDouble.stream().mapToDouble(a -> a).sum();
		System.out.println(sum1);
		//or
		sum1 = (int) numbersInDouble.stream().mapToDouble(Double::doubleValue).sum();
		System.out.println(sum1);
		
		*/
	}
}


class ArithmeticUtils {
	public static Integer sum(Integer a, Integer b) {
		return a+b;
	}
}
