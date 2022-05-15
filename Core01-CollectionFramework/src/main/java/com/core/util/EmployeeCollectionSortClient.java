package com.core.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeCollectionSortClient {

	public static void main(String[] args) {
		Employee e1 = new Employee(70000, "Nazeer2");
		Employee e2 = new Employee(20000, "Nazeer4");
		Employee e3 = new Employee(10000, "Nazeer3");
		Employee e4 = new Employee(30000, "Nazeer5");
		Employee e5 = new Employee(40000, "Nazeer1");
		Employee e6 = new Employee(60000, "Nazeer7");
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		System.out.println("Input before sorting : " + list);

		/*Collections.sort(list);
		System.out.println("Comparable:: Sorting using Emp Sal : " + list);
		*/

		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.salary - o2.salary;
			}

		});
		System.out.println("Comparator:: Sorting using Emp Salary : " + list);

		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println("Comparator:: Sorting using Emp Name : " + list);
	}

}
