package com.functional.interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student2 {
	int marks;
	String name;

	public Student2(int marks, String name) {
		// TODO Auto-generated constructor stub
		this.marks = marks;
		this.name = name;
	}
}

public class ConsumerTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Function
		Function<Student2, String> f = s -> {
			int marks = s.marks;
			String grade = "";
			if (marks >= 90)
				grade = "Distinction";
			else if (marks >= 80)
				grade = "First Class";
			else if (marks >= 60)
				grade = "Second Class";
			else if (marks >= 40)
				grade = "Third Class";
			else if (marks > 35)
				grade = "Just Pass";
			else
				grade = "fail";
			return grade;
		};
		Student2[] student2Array = { new Student2(56, "Nazeer"), new Student2(96, "Sardar"), new Student2(86, "Kareem"),
				new Student2(16, "Salma"), new Student2(66, "Parvin") };
//Consumer
		Consumer<Student2> c1 = s -> {
			System.out.println(s.name + " has secured " + f.apply(s) + " (" + s.marks + ")");
		};

//Predicate
		Predicate<Student2> p1 = s -> s.marks > 35;

		for (Student2 student2 : student2Array) {
			if (p1.test(student2)) {
				c1.accept(student2);
			}
		}

	}
}
