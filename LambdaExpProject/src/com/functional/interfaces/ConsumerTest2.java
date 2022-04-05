package com.functional.interfaces;

import java.util.function.Consumer;
import java.util.function.Function;

class Student1 {
	int marks;
	String name;

	public Student1(int marks, String name) {
		// TODO Auto-generated constructor stub
		this.marks = marks;
		this.name = name;
	}
}

public class ConsumerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Student1, String> f = s -> {
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
		Student1[] student1Array = { new Student1(56, "Nazeer"), new Student1(96, "Sardar"), new Student1(86, "Kareem"),
				new Student1(16, "Salma"), new Student1(66, "Parvin") };

		Consumer<Student1> c1 = s -> {
			System.out.println(s.name + " has secured " + f.apply(s) + " (" + s.marks + ")");
		};
		for (Student1 student1 : student1Array) {
			c1.accept(student1);
		}

	}

}
