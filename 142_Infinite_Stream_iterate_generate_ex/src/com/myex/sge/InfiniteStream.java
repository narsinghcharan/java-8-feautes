package com.myex.sge;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStream {

	public static void main(String[] args) {
		
		//Stream.iterate() :- It returns an infinite sequential ordered stream.
		
		Stream.iterate("Charan ", s->s).limit(5).forEach(System.out::print);
		
		System.out.println("\n---------------------------");
		
		List<Integer> numbers1 = Stream.iterate(5, n->n+1).limit(10).collect(Collectors.toList());
		System.out.println(numbers1);
		
		System.out.println("----------------------------");
		
		//Stream.generate() :-  It returns an infinite random ordered stream.
		Stream.generate(() -> "Charan ").limit(5).forEach(System.out::print);
		
		System.out.println("\n---------------------------");
		
		List<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100)).limit(10).collect(Collectors.toList());
		System.out.println(randomNumbers);
	}
}

/*
We will use Stream.generate() and Stream.iterate() methods to get the infinite streams.
Creating infinite streams is intermediate operation, so the elements creation doesn�t begin until the terminal operation of the pipeline is executed.

 */