package com.functional.interfaces;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee11 {
	String eName;
	int eNo;

	public Employee11(int eNo, String eName) {
		this.eName = eName;
		this.eNo = eNo;
	}

}

public class BiFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Integer, String, Employee11> bf = (eNo, eName) -> new Employee11(eNo, eName);
		ArrayList<Employee11> l = new ArrayList<Employee11>();
		l.add(bf.apply(300, "Rama"));
		l.add(bf.apply(100, "Sita"));
		l.add(bf.apply(700, "Karna"));

		for (Employee11 employee11 : l) {
			System.out.println("Emp no: " + employee11.eNo);
			System.out.println("Emp name: " + employee11.eName);
			System.out.println();
		}
	}

}
