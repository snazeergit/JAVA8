package com.core.util;

public class Employee implements Comparable<Employee>{
	Integer salary;
	String name;

	public Employee(Integer salary, String name) {
		this.salary = salary;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		//ascending order
		return this.salary-o.salary;
		
		//descending order
		//return o.salary-this.salary;
	}

}
