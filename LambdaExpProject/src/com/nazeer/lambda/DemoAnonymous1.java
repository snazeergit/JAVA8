package com.nazeer.lambda;

interface Inter10 {
	public void m1();

	public void m2();
}

class Testing implements Inter10 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2");
	}

}

public class DemoAnonymous1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing t1 = new Testing();
		t1.m1();
		t1.m2();
	}

}
