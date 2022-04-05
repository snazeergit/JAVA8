package com.nazeer.interfaces;

public interface interfaceTest {
	
	static void main() {
		System.out.println("From interface");
	}
	default void m1() {
		System.out.println("From default method");
	}

}
