package com.nazeer.methodRconstructorRef;

public class MethodRefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r = MethodRefDemo::m1;
		Thread t1 = new Thread(r);
		t1.start();
		for (int i = 1; i <= 10; i++) {

			System.out.println("Main thread");

		}
	}
	
	public static void m1() {
		for (int i = 1; i <= 10; i++) {

			System.out.println("child thread");

		}
	}
}
