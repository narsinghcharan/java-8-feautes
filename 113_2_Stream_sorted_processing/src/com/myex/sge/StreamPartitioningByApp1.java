package com.myex.sge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.myex.sge.pojo.Student;

//https://stackoverflow.com/questions/27993604/whats-the-purpose-of-partitioningby

public class StreamPartitioningByApp1 {

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
		
		/*
		 partitioning list of students by their age condition :-
		 
		 in partitioningBy(), grouping is done based on some condition.
		 
		 partitioningBy will always return a map with two entries, one for where the predicate is true and one for where it is false. 
		 It is possible that both entries will have empty lists, but they will exist.
		 
		 That's something that groupingBy will not do, since it only creates entries when they are needed.
		 
		 At the extreme case, if you send an empty stream to partitioningBy you will still get two entries in the map whereas groupingBy will return an empty map.
		 
		 */
		Map<Boolean,List<Student>> studentListByAgeMap1 = students.stream().collect(Collectors.partitioningBy(student -> student.getAge()>18));
		
		for(Map.Entry<Boolean, List<Student>> studentListByAgeMapEntry : studentListByAgeMap1.entrySet()) {
			
			System.out.println(studentListByAgeMapEntry.getKey() +" ->  "+ studentListByAgeMapEntry.getValue());
		}
		
		System.out.println("--------------------------------------------------------");
		
		
		//groupingBy :- trying to do the same by grouping by
		Map<Boolean,List<Student>> studentListByAgeMap2 = students.stream().collect(Collectors.groupingBy(student -> student.getAge()>18));
		
		for(Map.Entry<Boolean, List<Student>> studentListByAgeMapEntry : studentListByAgeMap2.entrySet()) {
			
			System.out.println(studentListByAgeMapEntry.getKey() +" ->  "+ studentListByAgeMapEntry.getValue());
		}
	}
}
