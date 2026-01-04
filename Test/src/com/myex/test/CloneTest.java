package com.myex.test;

public class CloneTest implements Cloneable{

	int i = 10;
	int j = 20;
	
	@Override
	public String toString() {
		return "i=" + i + ", j=" + j;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
	
		CloneTest t1 = new CloneTest();
		
		CloneTest t2 = (CloneTest) t1.clone();
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
	}
}
