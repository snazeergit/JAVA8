package com.functional.interfaces;

import java.util.function.Predicate;

public class IntPredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 5, 6, 8, 3, 7, 12, 94, 18, 13 };

		Predicate<Integer> p = i -> i % 2 == 0;
		for (int j : x) {

			if (p.test(j)) {
				System.out.println(j);
			}
		}
	}

}
