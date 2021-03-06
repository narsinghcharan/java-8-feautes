package com.myex.sge;

import java.util.stream.Stream;

public class Java8StringJoinEx {

	public static void main(String[] args) {
		
		//Stream.concat() method is used to merge two streams into one stream which consist of all elements of both merged streams.
		
		Stream<Integer> firstStream = Stream.of(1, 2, 3);
        Stream<Integer> secondStream = Stream.of(4, 5, 6);
         
        Stream<Integer> resultingStream = Stream.concat(firstStream, secondStream);
        
        resultingStream.forEach(System.out::println);
        
        System.out.println("---------------------------------");
        //Merge multiple streams
        
        Stream<Integer> first = Stream.of(1, 2);
        Stream<Integer> second = Stream.of(3,4);
        Stream<Integer> third = Stream.of(5, 6);
        Stream<Integer> fourth = Stream.of(7,8);
        
        Stream<Integer> resultingStream1 = Stream.concat(first, Stream.concat(second, Stream.concat(third, fourth)));
        
        resultingStream1.forEach(System.out::println);
	}
}
