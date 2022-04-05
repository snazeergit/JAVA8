package com.nazeer.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

}

public class StudentGradeSystem {

	public static void main(String[] args) {

		Function<Student, String> f = s -> {
			int marks = s.marks;
			if (marks > 90)
				return "A";
			else if (marks > 80)
				return "B";
			else if (marks > 60)
				return "C";
			else
				return "fail";
		};

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("kamal", 52));
		studentList.add(new Student("Mangal", 62));
		studentList.add(new Student("Komal", 32));
		studentList.add(new Student("kiran", 92));
		studentList.add(new Student("Rani", 72));
		studentList.add(new Student("Radha", 82));
		studentList.add(new Student("Rukmini", 22));

		Consumer<Student> c = s -> {
			System.out.println("Student Name  : " + s.name);
			System.out.println("Studnet Marks : " + s.marks);
			System.out.println("Studnet Grade : " + f.apply(s));
			System.out.println();
		};

		Predicate<Student> p = s -> s.marks > 60;
		// To sort students from Low grade to High grade
		//Comparator<Student> compSorting = (s1, s2) -> (s1.marks < s2.marks) ? -1 : (s1.marks > s2.marks) ? 1 : 0;

		// To sort students from High grade to low grade
		Comparator<Student> compSorting1 = (s1, s2) -> (s1.marks < s2.marks) ? 1 : (s1.marks > s2.marks) ? -1 : 0;
		
		
		//Collections.sort(List, Comparator)
		Collections.sort(studentList, compSorting1);

		for (Student student : studentList) {
			if (p.test(student)) {
				c.accept(student);
			}
		}

	}

}
