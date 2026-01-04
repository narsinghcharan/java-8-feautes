//w.a.p to print square of the given number using LongFunction

package com.myex.bf;

import java.util.function.LongFunction;

public class Test {

	public static void main(String[] args) {

		LongFunction<Long> f = i -> i*i;
		System.out.println(f.apply(5));
	}
}

/*
interface LongFunction<R> {
	public R apply(int n);
}

*/