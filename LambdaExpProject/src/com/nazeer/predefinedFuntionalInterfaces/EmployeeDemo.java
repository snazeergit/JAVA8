/**
 * 
 */
package com.nazeer.predefinedFuntionalInterfaces;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author snazeer
 *
 */

class Employee {
	String eName;
	int eSal;

	public Employee(String eName, int eSal) {
		super();
		this.eName = eName;
		this.eSal = eSal;
	}

}

public class EmployeeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Employee, String> f = e -> {
			if (e.eSal > 1000)
				return "Grade A";
			else if (e.eSal < 1000 && e.eSal > 800)
				return "Grade B";
			else if (e.eSal < 800 && e.eSal > 500)
				return "Grade C";
			else
				return "Grade D";
		};
		
		Predicate<Employee> p=e->e.eSal>500;
		
		Consumer<Employee> c=e->{
			System.out.println("Employee Name :"+e.eName);
			System.out.println("Employee Salary :"+e.eSal);
			System.out.println("Employee Pay Grade :"+f.apply(e));
			System.out.println();
		};
		
		ArrayList<Employee> arrayList=new ArrayList<Employee>();
		arrayList.add(new Employee("Ramu", 600));
		arrayList.add(new Employee("Kamu", 900));
		arrayList.add(new Employee("Damu", 500));
		arrayList.add(new Employee("Lamu", 300));
		arrayList.add(new Employee("Aamu", 700));
		arrayList.add(new Employee("Jamu", 800));
		arrayList.add(new Employee("Bamu", 400));
		
		for (Employee employee : arrayList) {
			if(p.test(employee)) {
				c.accept(employee);
			}
		}
		
		
	}
}
