package com.myex.test1;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		
		List<Integer> l = List.of(1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88,99);
		
		List<Integer> l1 = l.stream().map(i -> i*2).collect(Collectors.toList());
		
		l1.stream().forEach(System.out::println);
		
		List<Integer> l2 = l.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		
		System.out.println(l2);
		
		List<Integer> l3 = List.of(1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88,99);
		Collections.sort(l1, (i1,i2) -> (i1-i2));
		System.out.println(l1);

		
		Integer m = l.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(m);
		
		Integer[] iRrr = l.stream().toArray(Integer[]::new);
		
		
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);
		
		
		Instant instant = Instant.now();
		System.out.println(instant);
	}
}
