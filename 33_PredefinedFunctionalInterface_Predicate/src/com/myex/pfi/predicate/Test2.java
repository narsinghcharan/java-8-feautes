//wap to check whether given number is greater than 10 or not.

package com.myex.pfi.predicate;

import java.util.function.Predicate;

public class Test2 {

	public static void main(String[] args) {

		Predicate<Integer> p = (Integer i) -> {

			if(i > 10) {
				return true;
			} 
			else {
				return false;
			}
		};
		
		System.out.println(p.test(100));
		System.out.println(p.test(5));
	}
	
}
