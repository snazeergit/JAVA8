package com.functional.interfaces;

import java.util.function.Consumer;

public class ConsumerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Consumer will not return anything
		Consumer<String> c1 = s -> System.out.println(s);
		c1.accept("Nazeer Syed");
	}

}