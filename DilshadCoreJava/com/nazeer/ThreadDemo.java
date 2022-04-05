package com.nazeer;

public class ThreadDemo {
	int thread1;
	int thread2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = ()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("+");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("-");
		}
	}
}
