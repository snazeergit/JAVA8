package com.nazeer;

//Type casting example
class Test {
	void m1() {
		System.out.println("Test.m1()");
	}
}

public class Demo extends Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		t1.m1();
		Demo d1 = new Demo();
		d1.m1();
		d1.m2();
		
		//Down casting
		Demo d2=(Demo)t1;
		d2.m1();
		d2.m2();
		
		//Up casting
		Test t2=(Test)d1;
		t2.m1();
	}

	void m2() {
		System.out.println("Demo.m2()");
	}

}
