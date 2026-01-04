package com.myex.slwole;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Employee> l = new ArrayList<Employee>();
		
		l.add(new Employee(5,"narsingh"));
		l.add(new Employee(2,"charan"));
		l.add(new Employee(9,"saurya"));
		l.add(new Employee(6,"santosh"));
		l.add(new Employee(4,"nath"));
		
		System.out.println("Before Sort Method : " + l);
		
		//return -ve then obj1 come before obj2.
		//return +ve then obj1 come after obj2.
		//return 0 (zero) then obj and obj2 both are equal.
		//Collections.sort(l, (e1,e2) -> e1.getEmpNo()>e2.getEmpNo()?1:e1.getEmpNo()<e2.getEmpNo()?-1:0);		//ascending logic
		//or
		Collections.sort(l, (e1,e2) -> e1.getEmpNo() - e2.getEmpNo());		//ascending logic
		
		
		System.out.println("After Sort Method for ascending order: " + l);

	}
}
