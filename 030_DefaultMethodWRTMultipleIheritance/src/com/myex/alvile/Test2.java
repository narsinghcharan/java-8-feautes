package com.myex.alvile;

public class Test2 implements Left,Right{
	
	
	@Override
	public void m1() {
		Left.super.m1();
	}

	public static void main(String[] agrs) {
	
		Test2 t = new Test2();
		t.m1();		//default method will be called....
	}

}
/*
Here(above) there is an ambiguity problem because we have implemented both the interfaces and so to resolve this issue we 
have to override m1() method in the implemented class so when we call m1() method then overridden method m1() of Test2 
class will be called and we can write our own logic in overridden method or we can call or tell which interface method 
we need to call.

*/