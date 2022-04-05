package com.functional.interfaces;

//Without using Predicate function interface, lambda expression
class Testing {
	public boolean validate(int n) {
		if (n % 2 == 0)
			return true;
		else
			return false;
	}
}

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing t1 = new Testing();
		System.out.println(t1.validate(10));
		System.out.println(t1.validate(15));
	}
}
