package com.myex.sge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.myex.sge.pojo.Student;

public class SortingStreamOnMultipleFields2 {

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
		
		
		//if the key with which we want to create map is not unique then we have to create map like this
		Map<Integer, List<Student>> studentsMapByAge = students.stream().collect(Collectors.groupingBy(student -> student.getAge()));
		//or
		// studentsMapByAge = students.stream().collect(Collectors.groupingBy(student -> student.getAge(), Collectors.toList()));
		
		System.out.println(studentsMapByAge);
		
		//if the key with which we want to create map is unique then we can create map like this		
		Map<Integer, Student> studentMapById = students.stream().collect(Collectors.toMap(Student::getId, student -> student));
		//or
		//Map<Integer, Student> studentMapById = students.stream().collect(Collectors.toMap(student -> student.getId(), Function.identity()));
		
		
		System.out.println(studentMapById);
		
		//but what if some of the keys are null :- we will get null pointer exception
		
		students.add(new Student(10,"Ramesh",null));
		
		//studentsMapByAge = students.stream().collect(Collectors.groupingBy(student -> student.getAge()));
		
		//so we will remove those element whose key is null
		
		studentsMapByAge = students.stream().filter(student -> student.getAge() != null).collect(Collectors.groupingBy(student -> student.getAge()));
		
		System.out.println(studentsMapByAge);
	}
}
