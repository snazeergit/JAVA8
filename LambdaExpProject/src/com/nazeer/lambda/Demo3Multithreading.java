package com.nazeer.lambda;

//A functional interface is an interface that contains only one abstract method irrespective of no of default and static methods in it.
//Since Runnable is Functional interface I can use Lambda expression rather writing another call. Demo4 sample demonstrates it.
class MyRunable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {

			System.out.println("child thread");

		}
	}
}

public class Demo3Multithreading {

	public static void main(String[] args) {

		MyRunable m1 = new MyRunable();
		Thread t1 = new Thread(m1);
		t1.start();
		for (int i = 1; i <= 10; i++) {

			System.out.println("Main thread");

		}
	}
}