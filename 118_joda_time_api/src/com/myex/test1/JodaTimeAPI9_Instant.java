/*

*/
package com.myex.test1;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//The java.time.Instant class represents a moment on the timeline in UTC. 
//It is ideal when you want a database column to represent a UTC timestamp.
public class JodaTimeAPI9_Instant {

	public static void main(String[] args) {

		Instant nowUtc = Instant.now(); 
		System.out.println(nowUtc);
		
	}
}
