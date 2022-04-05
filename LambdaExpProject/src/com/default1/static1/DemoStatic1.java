package com.default1.static1;

//Demonstration of static method
interface interstat {
	/*
	 * interface static methods can not be inherited, don't participate in
	 * inheritance process, so you can not call with respect to the derived class
	 * object, we can only call with interface name only.
	 */

	// The purpose of the static is to define general utility methods inside
	// interface we use static methods.
	public static void m1() {
		System.out.println("interface static method");
	}
}

class DemoStatic2 {

	void m2() {
		interstat.m1();// calling a static method using interface name from a independent class
	}
}

public class DemoStatic1 implements interstat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * interface static methods can only be called using its interface name
		 * irrespective of from where we are calling such as independent calls or
		 * derived class
		 */
		interstat.m1();

		DemoStatic2 d2 = new DemoStatic2();
		d2.m2();
	}
}