package com.functional.interfaces;

import java.util.function.Predicate;

//Using Predicate function interface, lambda expression
public class PredicateTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "abcefg", "ab", "a", "abc", "abcd" };
		// condition to check names length greater than 3
		Predicate<String> p2 = k -> k.length() > 3;
		// looping through all the names
		for (String s : str) {
			// test method return true only if name greater 3 based on the lambda expression
			// and we print them.
			if (p2.test(s)) {
				System.out.println(s);
			}
		}
		/*
		 * for (String s1 : str) { if (new PredicateTest3().test(s1))
		 * System.out.println(s1); }
		 */
	}
	//Converted this to lambda expression
	/*
	 * public boolean test(String i) {
	 * 
	 * if (i.length() > 3) return true; else return false; }
	 */

}
