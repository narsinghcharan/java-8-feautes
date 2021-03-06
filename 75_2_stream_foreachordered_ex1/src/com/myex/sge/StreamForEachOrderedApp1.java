package com.myex.sge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.myex.sge.pojo.Student;

public class StreamForEachOrderedApp1 {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student(1,"Narsingh",29));
		students.add(new Student(2,"Charan",28));
		students.add(new Student(3,"Babu",20));
		students.add(new Student(4,"Santosh",30));
		students.add(new Student(5,"Nath",27));
		students.add(new Student(6,"Charan",28));
		students.add(new Student(7,"Payari",32));
		students.add(new Student(8,"Kuni",31));
		students.add(new Student(9,"Santuni",30));
		students.add(new Student(10,"Bhai",29));
		
		//making list of name from the given list of student list
		List<String> names = new ArrayList<>();
		
		students.forEach(student -> names.add(student.getName()));		//students.forEach() :- the order of elements 
															//(during iteration) is same as the order in the stream source
		
		System.out.println(names);
		
		System.out.println("-----------------------------------------------");
		
		names.clear();
		students.stream().forEach(student -> names.add(student.getName()));	
		//students.stream().forEach() :- this is sequential stream and the order of elements 
		//(during iteration) is same as the order in the stream source
		System.out.println(names);
		
		System.out.println("-----------------------------------------------");
		
		names.clear();
		students.parallelStream().forEach(student -> names.add(student.getName()));	
		System.out.println(names);
		
		//if we want to preserve order of the elements same as the order in the stream source then we have to go for forEachOrdered()
		
		System.out.println("-----------------------------------------------");
		
		names.clear();
		students.parallelStream().forEachOrdered(student -> names.add(student.getName()));	
		System.out.println(names);
		
/*		
Notes :-
using forEach() method directly on list is same as using forEach() on sequential stream.

but when we use forEach() method on parallel stream then the order of output elements are not same as input elements.
if we want to keep the order same in parallel stream then we have to use forEachOrdered().

		
*/		
		
	}
}

/*

https://howtodoinjava.com/java8/java-streams-by-examples/  :-

Stream forEach() and forEachOrdered()
In Stream, forEach() and forEachOrdered() are terminal operations.

Similar to Iterable, stream forEach() method performs an action for each element of the stream.

For sequential streams, the order of elements (during iteration) is same as the order in the stream source, 
so the output would be same whether we use forEach() or forEachOrdered().

while using parallel streams, use forEachOrdered() if order of the elements matter during the iteration. 
forEach() method does not gaurantee the element ordering to provide the advantages of parallelism.
  
 */



