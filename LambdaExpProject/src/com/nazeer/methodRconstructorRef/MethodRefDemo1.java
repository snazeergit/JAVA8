package com.nazeer.methodRconstructorRef;

interface Inter1 {
	public void add(int a, int b);
}
//Using Lambda Expression 
public class MethodRefDemo1 {

	public static void main(String[] args) {
		Inter1 i1 = (a, b) -> System.out.println("Sum :" + (a + b));
		i1.add(10, 20);
	}

}
