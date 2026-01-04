package com.myex.womr;

interface Interf {

	public void m1();
}

public class Test {

	public static void m2() {					//static method
		System.out.println("implementation by method reference");
	}

	public static void main(String args[]) {

		Interf i = Test::m2;
		i.m1();

	}
}

/*
Instead of providing implementation for m1() method using lambda expression, we are providing reference of m2() in m1()
method or we can say we are referring m2() method from m1() method so whenever we will call m1() method, it will automatically
refer m2() method. That's why it is called method reference.

The biggest advantage of Method Reference is code re-usability. ie. already existing m2() method implementation 
I am using for m1() method implementation instead of defining new implementation.

Method reference condition :-
while using method reference, referrer and referring both methods should have same arguments types, but method name, 
return type, access modifiers can be different and both method can be static or non static in any combination is fine.

Method Reference is alternative syntax to lambda expression.
 
 
*/