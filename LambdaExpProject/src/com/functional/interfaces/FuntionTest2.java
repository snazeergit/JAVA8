package com.functional.interfaces;

import java.util.function.Function;

class Student {
	int marks;
	String name;

	public Student(int marks, String name) {
		// TODO Auto-generated constructor stub
		this.marks = marks;
		this.name = name;
	}
}

public class FuntionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Student, String> f = s -> {
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
		Student[] studentArray = { new Student(56, "Nazeer"), new Student(96, "Sardar"), new Student(86, "Kareem"),
				new Student(16, "Salma"), new Student(66, "Parvin") };

		for (Student student : studentArray) {
			System.out.println(student.name + " has secured " + f.apply(student) + " (" + student.marks + ")");
		}

	}

}
