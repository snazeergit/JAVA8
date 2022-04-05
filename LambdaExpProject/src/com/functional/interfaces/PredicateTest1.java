package com.functional.interfaces;

import java.util.function.Predicate;

//Using Predicate function interface, lambda expression
public class PredicateTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> p1 = n -> n % 2 == 0;//Lambda expression for conditional logic, it will return either true or false, no need to write explicitly
		System.out.println(p1.test(10));// Predicate interface contains only one abstract method test() whose return type is boolean.
		System.out.println(p1.test(15));
	}
}
