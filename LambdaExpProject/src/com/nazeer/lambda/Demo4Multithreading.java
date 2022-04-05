package com.nazeer.lambda;

public class Demo4Multithreading {

	public static void main(String[] args) {
		//Lambda Expression
		Runnable m1 =()->{
			for (int i = 1; i <= 10; i++) {
				System.out.println("Child thread");
			}
		};
		Thread t1=new Thread(m1);
		t1.start();
		for (int i = 1; i <= 10; i++) {

			System.out.println("Main thread");

		}
	}

}