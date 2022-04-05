package com.default1.static1;

//Default method demonstration.
interface interdefault {

	// Main purpose of default methods is With out effecting the implementation
	// classes we can add the new methods to the interface.
	//default methods will inherited to sub class, overriding is optional as it already contains default body.
	//default methods can not defined in a class and implementation of the default class must be public.
	default void m1() {
		System.out.println("interface default method");
	}
}

public class DemoDefault1 implements interdefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoDefault1 d1 = new DemoDefault1();
		d1.m1();
		interdefault i1 = new DemoDefault1();
		i1.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		// Calling interface default method from a sub class
		// interdefault.super.m1();
		System.out.println("Overridden interface default method");
	}

}
