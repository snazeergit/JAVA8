package com.functional.interfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
	}
}

//Using Predicate function interface, lambda expression
public class PredicateTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Varun", 1000);
		Employee e2 = new Employee("Tarun", 9000);
		Employee e3 = new Employee("Arun", 3000);
		Employee e4 = new Employee("Karuna", 5000);
		Employee e5 = new Employee("Vinesh", 7000);
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		Predicate<Employee> p = e -> e.salary > 3000 & e.salary < 10000;
		for (Employee employee : list) {
			if (p.test(employee)) {
				System.out.println(employee.salary + " : " + employee.name);
			}

		}

	}

}
