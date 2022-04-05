package com.nazeer.methodRconstructorRef;

interface Inter2 {
	public void add(int a, int b);
}

//Using Method reference
public class MethodRefDemo2 {

	public static void m1(int x, int y) {
		System.out.println("addition :" + (x + y));
	}

	public static void main(String[] args) {
		Inter2 i1 = MethodRefDemo2::m1;
		i1.add(10, 20);
	}

}
