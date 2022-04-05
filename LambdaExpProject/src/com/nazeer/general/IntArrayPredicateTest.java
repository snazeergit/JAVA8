package com.nazeer.general;

import java.util.function.Function;

public class IntArrayPredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { 1, 5, 3};
				
		Function<Integer, Integer> f1 = i -> i * 2;
		Function<Integer, Integer> f2 = i -> i - 2;

		System.out.println("Doubled numbers are :");
		for (int j : intArray) {

			System.out.println(f1.apply(j));
		}

		System.out.println("f1 and f2 :");
		for (int j : intArray) {

			System.out.println(f1.andThen(f2).apply(j));
		}

		System.out.println("f1 or f2 :");
		for (int j : intArray) {

			System.out.println(f1.compose(f2).apply(j));
		}

	}

}
//Output printing is not consistent
