package com.myex.alvile;

public class Test1 implements Interf{
	
	public static void main(String[] agrs) {
	
		Test1 t = new Test1();
	//	t.m1();			//compile time error
	//	Test.m1();		//compile time error
		Interf.m1();
	}

}

/*

note :- interface static method doesn't available to the implementing class. so we can't call 
interface static method using implementation class object reference or using implementation class 
name.
so interface static method, we can call using that interface name only.

note :- the main objective of interface static method is to declare general utility methods.

*/
