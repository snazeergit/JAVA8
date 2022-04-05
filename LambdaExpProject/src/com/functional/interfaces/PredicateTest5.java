package com.functional.interfaces;

import java.util.function.Predicate;

//Using Predicate function interface, lambda expression
public class PredicateTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 3, 5, 7, 9, 10, 15, 20, 25, 30, 35, 40, 45 };

		Predicate<Integer> p1 = k -> k % 2 == 0;// Even
		Predicate<Integer> p2 = k -> k > 10; // greater than 10
		Predicate<Integer> p3 = k -> k % 2 != 0; // Odd

		System.out.println("Even and >10 : ");
		for (int i : intArray) {
			if (p1.and(p2).test(i)) {
				System.out.println(i);
			}
		}
		System.out.println("Even or >10 : ");
		for (int i : intArray) {
			if (p1.or(p2).test(i)) {
				System.out.println(i);
			}
		}

		System.err.println("Not Even and >10: ");
		for (int i : intArray) {
			if (p1.negate().and(p2).test(i)) {
				System.out.println(i);
			}
		}

	}
}
 