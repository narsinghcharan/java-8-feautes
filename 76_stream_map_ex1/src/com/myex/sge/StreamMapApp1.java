package com.myex.sge;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.myex.sge.pojo.Student;

public class StreamMapApp1 {

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

		List<String> names = students.stream().map(student -> student.getName()).collect(Collectors.toList());
		
		names.forEach(name -> System.out.println(name));
		//or
		names.stream().forEach(name -> System.out.println(name));
		//or
		names.forEach(System.out::println);
		
		
		//making list of names in upper case from the given list of student list
		
		List<String> namesInUpperCase1 = students.stream().map(student -> student.getName()).map(s -> s.toUpperCase()).collect(Collectors.toList());
		//or
		List<String> namesInUpperCase2 = students.stream().map(student -> student.getName()).map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(namesInUpperCase1);
		System.out.println(namesInUpperCase2);
		
		//or
		
		Function<Student,String> studentNames1 = student -> student.getName();
		Function<Student,String> studentNamesInUpperCaseFunction1 = studentNames1.andThen(s -> s.toUpperCase());
		List<String> namesInUpperCase3 = students.stream().map(studentNamesInUpperCaseFunction1).collect(Collectors.toList());
		System.out.println(namesInUpperCase3);

		//or
		
		Function<Student,String> studentNames2 = student -> student.getName();
		Function<String,String> studentNamesInUpperCaseFunction2 = name -> name.toUpperCase();
				
		Function<Student,String> fun = 	studentNames2.andThen(studentNamesInUpperCaseFunction2);
		List<String> namesInUpperCase4 = students.stream().map(fun).collect(Collectors.toList());
		System.out.println(namesInUpperCase4);
		
	}
}
