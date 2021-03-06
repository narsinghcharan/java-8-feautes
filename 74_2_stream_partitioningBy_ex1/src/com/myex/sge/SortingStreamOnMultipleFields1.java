package com.myex.sge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.myex.sge.pojo.Student;

public class SortingStreamOnMultipleFields1 {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student(1,"Narsingh",29));
		students.add(new Student(2,"Narsingh",28));
		students.add(new Student(3,"Babu",20));
		students.add(new Student(4,"Babu",30));
		students.add(new Student(5,"Nath",27));
		students.add(new Student(6,"Charan",28));
		students.add(new Student(7,"Payari",32));
		students.add(new Student(8,"Kuni",31));
		students.add(new Student(9,"Santuni",30));
		students.add(new Student(10,"Charan",29));
		
		// I want to sort this list of students object by there Name and if Name is same then by their Age.
		
		Comparator<Student> comparatorFunction = (s1 , s2) -> {
			
			int result = s1.getName().compareTo(s2.getName());
			
			if(result != 0) {
				return result;
			} else {
				return s1.getAge().compareTo(s2.getAge());
			}
		};
		
		List<Student> sortedStudentList = students.stream().sorted(comparatorFunction).collect(Collectors.toList());
		
		System.out.println(sortedStudentList);
	}
}
