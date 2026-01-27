package com.myex.test1;

import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
		
		//Stream.iterate(0, n->n+1).limit(10).forEach(System.out::println);
		
		Stream.iterate(new int[] {0,1}, n->new int[] {n[1], n[0]+n[1]}).limit(10).forEach(n-> System.out.println(n[0]));
	}
}
