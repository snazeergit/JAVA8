package com.functional.interfaces;

import java.util.function.BiPredicate;

public class BiPredicateTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiPredicate<Integer, Integer> bp1 = (a, b) -> (a + b) % 2 == 0;
		if (bp1.test(10, 20)) {
			System.out.println("Sum of two is Even");
		}
	}

}
