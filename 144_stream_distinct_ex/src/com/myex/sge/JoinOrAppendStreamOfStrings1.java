package com.myex.sge;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JoinOrAppendStreamOfStrings1 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,1,2,8,9,3,4);
		
		 String numbersInJoinedString = numbers.stream().map(n -> n.toString()).collect(Collectors.joining(","));
		 System.out.println(numbersInJoinedString);
		 
		 //----------------------------------------
		 
		 
		 List<String> charList = Arrays.asList("A","B","C","D");
		 
		 String joinedString1 = charList.stream().collect(Collectors.joining());
		 System.out.println(joinedString1);
		 
		 String joinedString2 = charList.stream().collect(Collectors.joining(","));
		 System.out.println(joinedString2);

		 String joinedString3 = charList.stream().collect(Collectors.joining(",","{","}"));
		 System.out.println(joinedString3);
	}
}

/*
The above thing is only working for String not for Character or any other objects.
*/
