package com.nazeer.methodRconstructorRef;

public class MyMethodRef {

	public static void main(String[] args) {
		//MyInter is an interface saved as another java file
		MyInter inter=new MyMethodRef()::m1;
		inter.multiplication(2, 10);

	}
	
	public void m1(int x, int y) {
		System.out.println("Multiplication : "+ x*y);
	}

}
