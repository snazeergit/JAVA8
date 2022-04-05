package com.default1.static1;

interface p111 {
	 void m1() ;
}

interface p222 {
	void m1() ;
}

public class InheritDemo3 implements p111,p222 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Overridden m1 method from InheritDemo");
		//TO invoke m1 of p1 interface, possible only m1 is default method
		//p1.super.m1();
		//TO invoke m1 of p2 interface, possible only m1 is default method
		//p2.super.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p111 p1 = new InheritDemo3();
		p1.m1();
		p222 p2 = new InheritDemo3();
		p2.m1();
	}
}
