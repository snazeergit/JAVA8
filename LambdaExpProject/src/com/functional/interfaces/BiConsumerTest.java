package com.functional.interfaces;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee111 {
	String eName;
	double eSalary;

	public Employee111(String eName, double eSalary) {
		this.eName = eName;
		this.eSalary = eSalary;
	}
}

public class BiConsumerTest {

	public static void main(String[] args) {

		ArrayList<Employee111> l = new ArrayList<Employee111>();
		l.add(new Employee111("Durga", 1000));
		l.add(new Employee111("Summy", 8000));
		l.add(new Employee111("Ramu", 3000));
		l.add(new Employee111("Chinni", 2000));
		
		BiConsumer<Employee111, Double> c = (e, hike) -> e.eSalary = e.eSalary + hike;
		for (Employee111 e : l) {
			c.accept(e, 500.0);
		
			System.out.println("Employee Name :" + e.eName);
			System.out.println("Employee Salary :" + e.eSalary);
			System.out.println();
		}
	}

}
