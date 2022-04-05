package com.functional.interfaces;

import java.util.function.Function;
import java.util.function.Predicate;

class Student3 {
	int marks;
	String name;

	public Student3(int marks, String name) {
		// TODO Auto-generated constructor stub
		this.marks = marks;
		this.name = name;
	}
}

public class FuntionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Student3, String> f = s -> {
			if (s.marks >= 90)
				return "Distinction";
			else if (s.marks >= 80 && s.marks < 90)
				return "First Class";
			else if (s.marks >= 60 && s.marks < 80)
				return "Second Class";
			else if (s.marks >= 40 && s.marks < 60)
				return "Third Class";
			else if (s.marks > 35 && s.marks < 40)
				return "Just Pass";
			else
				return "fail";
		};
		Student3[] studentArray = { new Student3(56, "Nazeer"), new Student3(96, "Sardar"), new Student3(86, "Kareem"),
				new Student3(16, "Salma"), new Student3(66, "Parvin") };

		for (Student3 student : studentArray) {
			System.out.println(student.name + " has secured " + f.apply(student) + " with " + student.marks + " marks");
		}
		// Students failed
		// System.out.println("**************F");
		Predicate<Integer> p1 = m -> m < 35;

		for (Student3 student3 : studentArray) {
			if (p1.test(student3.marks)) {
				System.err.println("Students faild :" + student3.name + " with marks " + student3.marks);
			}
		}

		// Students first class and above
		// System.out.println("**************P");
		Predicate<Integer> p2 = m -> m >= 80;
		for (Student3 student3 : studentArray) {
			if (p2.test(student3.marks)) {
				System.out.println(student3.name + " with marks " + student3.marks);
			}
		}
	}
}
