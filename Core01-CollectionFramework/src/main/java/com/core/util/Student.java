package com.core.util;

public class Student implements Comparable<Student> {

	Integer rollNo;
	String name;

	public Student(Integer rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student that) {

		// Sort the Student object based on rollNo
		return this.rollNo - that.rollNo;

		// Sort the Student object based on student name
		// return this.name.compareTo(that.name);
	}

}
