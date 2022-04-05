package com.nazeer.lambda;

public class DemoAnonymous2 {

	public static void main(String[] args) {
//can not implement lambda expression for this inner class as Inter11 is not a Functional Interface (it has two abstract methods so) 
		Inter11 i = new Inter11() {

			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("m3");
			}

			@Override
			public void m2() {
				// TODO Auto-generated method stub
				System.out.println("m4");
			}
		};
		i.m1();
		i.m2();
	}
}