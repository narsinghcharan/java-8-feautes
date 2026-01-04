//w.a.p to print length of the given String using ToIntFunction

package com.myex.bf;

import java.util.function.ToIntFunction;

public class Test {

	public static void main(String[] args) {

		ToIntFunction<String> f = s -> s.length();		// here type parameter talks about the input param type.
		System.out.println(f.applyAsInt("Durga"));
	}
}

/*
interface ToIntFunction<T> {
	public int applyAsInt(T t);
}

*/