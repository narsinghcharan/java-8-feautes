/*

*/
package com.myex.test1;

import java.util.ArrayList;
import java.util.List;

public class ToArrayTest {
	public static void main(String[] args){
				
		List<Integer> l1 = new ArrayList<Integer>();
	
		l1.add(10);
		l1.add(4);
		l1.add(8);
		l1.add(2);
		l1.add(5);
	
		System.out.println(l1);
		
		Integer[] array = l1.stream().toArray(Integer[] :: new);
		
		for(int x : array) {

			System.out.println(x);
		}
		
		System.out.println("-----------------------------------");

		Integer[] evenNumbers = l1.stream().filter(i -> i%2==0).toArray(Integer[] :: new);
		
		for(int x : evenNumbers) {

			System.out.println(x);
		}
	}
}
