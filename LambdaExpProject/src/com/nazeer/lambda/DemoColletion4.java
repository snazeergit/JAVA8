package com.nazeer.lambda;

import java.util.*;

class Employee {
	int empNo;
	String empName;

	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}

	public String toString() {
		return empNo + ":" + empName;

	}
}

public class DemoColletion4 {
	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(999, "jam"));
		list.add(new Employee(222, "kam"));
		list.add(new Employee(888, "aam"));
		System.out.println(list);
		Collections.sort(list,(e1,e2)->(e1.empNo<e2.empNo)?-1:(e1.empNo>e2.empNo)?1:0 );
//		Collections.sort(list, (e1,e2)->e1.empName.compareTo(e2.empName));
		System.out.println(list);
	}
}
