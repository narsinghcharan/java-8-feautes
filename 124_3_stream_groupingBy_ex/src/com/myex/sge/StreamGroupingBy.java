package com.myex.sge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.myex.sge.pojo.Address;
import com.myex.sge.pojo.Student;

public class StreamGroupingBy {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		Address address1 = new Address("Bhilai");
		Address address2 = new Address("Odisha");
		Address address3 = new Address("Klinga");
		
		students.add(new Student(1,"Narsingh",29, address1));
		students.add(new Student(2,"Narsingh",28, address1));
		students.add(new Student(3,"Babu",20, address1));
		students.add(new Student(4,"Babu",30, address2));
		students.add(new Student(5,"Nath",27, address2));
		students.add(new Student(6,"Charan",28, address2));
		students.add(new Student(7,"Payari",32, address3));
		students.add(new Student(8,"Kuni",31, address3));
		students.add(new Student(9,"Santuni",30, address3));
		students.add(new Student(10,"Charan",29, address3));
		
		/*
		// I want to sort this list of students object by there Name and if Name is same then by their Age.
		Comparator<Student> comparatorFunction = Comparator.comparing(Student::getName).thenComparing(Student::getAge);
		List<Student> sortedStudentList = students.stream().sorted(comparatorFunction).collect(Collectors.toList());
		System.out.println(sortedStudentList);
		*/
		
		Map<String,List<Student>> studentMapByAddress = students.stream().collect(Collectors.groupingBy(student -> student.getAddress().getCity() ));
		
		System.out.println(studentMapByAddress);
	}
}
