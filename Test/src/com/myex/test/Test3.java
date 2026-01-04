package com.myex.test;

class Parent {
	public static void main(String[] args) {
		System.out.println("parent main"); // Parent.java
	}
}

class Test3 extends Parent {
	public static void main(String[] args) {
		System.out.println("Child main");
	}
}