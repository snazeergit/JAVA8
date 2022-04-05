package com.functional.interfaces;

import java.util.function.Function;

public class FunctionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("VMware"));
	}

}
