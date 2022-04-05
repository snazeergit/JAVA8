package com.nazeer.lambda;

//Since Runnable is Functional interface I can use Lambda expression rather writing another call. Demo4 sample demonstrates it.

public class Demo5MultithreadingInnerclass {

	public static void main(String[] args) {
		//anonymous inner class
		MyRunable m1 = new MyRunable() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("child thread");
				}
			}
		};
		
		Thread t1 = new Thread(m1);
		t1.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main thread");
		}
	}
}