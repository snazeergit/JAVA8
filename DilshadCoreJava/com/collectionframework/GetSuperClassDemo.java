package com.collectionframework;

import javax.swing.*;
import java.util.Date;

public class GetSuperClassDemo {
	public static void main(String[] args) {
		GetSuperClassDemo.get(String.class);
		GetSuperClassDemo.get(Number.class);
	}

	public static void get(Class<?> c) {
		// Gets array of direct interface of c object
		Class<?>[] interfaces = c.getInterfaces();
		System.out.println(c.getName()+" implements");
		for (Class<?> clz : interfaces) {
			System.out.println("\t"+clz.getName());
		}

		// Gets array of direct superclass of c object
		Class<?> superclz = c.getSuperclass();
		System.out.println(c.getName()+" extends "+ superclz.getName());
		System.out.println("====================================");
	}
}