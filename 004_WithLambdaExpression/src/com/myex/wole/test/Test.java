package com.myex.wole.test;

import com.myex.wole.Interf;

public class Test {

	public static void main(String[] args) {
		
		Interf i = (a,b) -> System.out.println("the sum :- "+  (a+b));		//here variable "i" is holding the complete behavior/method logic/Lambda Expression
		
		i.add(10 , 20);
		
		i.add(100 , 200);
	}
}

/*

Here we have not provided the type of parameters "a" and "b", but compiler can guess automatically based on the context which is called type inference.

here the Lambda Expression is represented by, "Interf" interface type of variable, then immediately compiler will check that these 
are the arguments to abstract method add() of Interf interface, so compiler can guess automatically then name of the method, number 
of arguments, the arguments type by comparing with abstract method of Interf interface.


*/