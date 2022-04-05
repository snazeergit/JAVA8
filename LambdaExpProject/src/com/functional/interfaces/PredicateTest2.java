package com.functional.interfaces;

import java.util.function.Predicate;

//Using Predicate function interface, lambda expression
public class PredicateTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<String> p1 = k -> k.length() > 5; // Lambda expression for conditional logic, it will return either
													// true or false, no need to write explicitly
		System.out.println(p1.test("welcome"));// Predicate interface contains only one abstract method test()
		System.out.println(p1.test("Naz"));

	}
}
