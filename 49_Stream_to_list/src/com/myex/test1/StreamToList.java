/*
w.a.p to filter all the even numbers from the collection into another list.
*/
package com.myex.test1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToList {

	public static void main(String[] args) {
		
		List<Integer> l = new  ArrayList<Integer>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		System.out.println(l);
		
		List<Integer> l1 = l.stream().filter(i -> i%2 == 0).collect(Collectors.toList());	//it will return ArrayList
		
		System.out.println(l1);
		
		//if I want stream to LinkedList then
		
		List<Integer> l2 = l.stream().filter(i -> i%2 == 0).collect(Collectors.toCollection(LinkedList::new));
		System.out.println(l2);
	}
}
