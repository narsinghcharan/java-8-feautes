package com.myex.womr;

public class Test {

	public void m1() {		//here run() method arg type and m1() method arg type both is same
		for (int i = 0; i< 10 ; i++){
		
			System.out.println("Child Thread");
		}
	}
	
	public static void main(String[] args){
	
		Test obj = new Test();
		
		Runnable r = obj::m1;	//whatever implementation is there inside m1() method I am using that for Runnable run() method implementation by method reference.
		
		Thread t = new Thread(r);
		
		t.start();
		
		for (int i = 0; i< 10 ; i++){
			
			System.out.println("Main Thread");
		}

	}

}
