/*

*/
package com.myex.test1;

import java.time.LocalDate;
import java.time.LocalTime;

public class JodaTimeAPI1 {
	
	public static void main(String[] args){
				
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		
		System.out.println(time);
		
	}
}
