package com.default1.static1;

interface p1 {
	default void m1() {
		System.out.println("p1 m1");
	}
}

interface p2 {
	default void m1() {
		System.out.println("p2 m1");
	}
}

public class InheritDemo2 implements p1, p2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Overridden m1 method from InheritDemo");
		// TO invoke m1 of p1 interface, possible only m1 is default method
		// p1.super.m1();
		// TO invoke m1 of p2 interface, possible only m1 is default method
		// p2.super.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p1 p1 = new InheritDemo2();
		p1.m1();
	}
}
