package com.myex.sge;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Java8StringJoinEx {

	public static void main(String[] args) {
		
		//String join(CharSequence delimiter, CharSequence... elements)
		String joinedString = String.join("- ", "How", "To", "Do", "In", "Java");
		System.out.println(joinedString);
		
		
		List<String> strList = Arrays.asList("How", "To", "Do", "In", "Java");
		joinedString = String.join(", ", strList);
		System.out.println(joinedString);
		
		
		StringJoiner joiner = new StringJoiner(", ", "[", "]");
		joiner.add("How")
		        .add("To")
		        .add("Do")
		        .add("In")
		        .add("Java");
		
		System.out.println(joiner.toString());
	}
}
