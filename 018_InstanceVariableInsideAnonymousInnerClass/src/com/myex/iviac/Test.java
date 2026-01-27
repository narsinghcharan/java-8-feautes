package com.myex.iviac;

public class Test {

	int x = 888;

	public void m2() {

		Interf i = new Interf() {		//Anonymous inner class

			int x = 999; // instance variable of anonymous inner class.

			public void m1() {
				int x = 111;

				System.out.println(x); // 111
				System.out.println(this.x); // 999
				System.out.println(Test.this.x); // 888
			}
		};
		i.m1();
	}

	public static void main(String[] agrs) {

		Test t = new Test();
		t.m2();
	}
}
/*
inside anonymous inner class we can declare instance variables.
Inside anonymous inner class "this" always refers to current inner class object only.


*/