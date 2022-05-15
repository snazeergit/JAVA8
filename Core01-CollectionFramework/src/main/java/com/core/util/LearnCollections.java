package com.core.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollections {

	public static void main(String[] args) {
		Student s1 = new Student(20, "Nazeer");
		Student s2 = new Student(40, "Dilshad");
		Student s3 = new Student(10, "Ramu");
		Student s4 = new Student(30, "Sardar");

		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		System.out.println("INPUT :"+list);
			
		
		//Sorts the specified list into ascending order, according to the natural ordering of its elements.
		//All elements in the list must implement the Comparable interface.
		Collections.sort(list);
		
		System.out.println("COMPARABLE::SORTED USING ROLLNO : "+list);

		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student ss1, Student ss2) {
				// TODO Auto-generated method stub
				return ss1.name.compareTo(ss2.name);
			}
		});
		System.out.println("COMPARATOR::SORTED USING NAME : "+list);
		
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student ss1, Student ss2) {
				// TODO Auto-generated method stub
				return ss1.rollNo-ss2.rollNo;
			}
		});
		System.out.println("COMPARATOR::SORTED USING ROLLNO : "+list);
	}

}
