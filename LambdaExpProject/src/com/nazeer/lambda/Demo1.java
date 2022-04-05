package com.nazeer.lambda;

@FunctionalInterface
interface inter1 {
	public void welcome1();

	default void welcome2() {
		System.out.println("From default method");
	}

	public static void welcome3() {
		System.out.println("from static method");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inter1 i = () -> System.out.println("From abstract method using Lambda Expressions");
		i.welcome1();
		
//		i.welcome2();
//		inter1.welcome3();//static methods can not be invoked using objects
	}
}