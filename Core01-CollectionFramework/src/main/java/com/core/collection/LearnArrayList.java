package com.core.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>();

		list1.add(10);
		list1.add(70);
		list1.add(30);

		list1.add(2, 40);
		list1.add(1, 80);

		System.out.println(list1);

		List<Integer> list2 = new ArrayList<>();

		list2.add(90);
		list2.add(60);

		list2.addAll(1, list1);

		System.out.println(list2);

		// Sorting
		Collections.sort(list2);

		System.out.println(list2);

		System.out.println(list1.get(3));

		System.out.println(list1.isEmpty());

		System.out.println(list1.remove(1));
		System.out.println(list1);

		System.out.println(list1.remove(Integer.valueOf(30)));

		list1.clear();
		System.out.println(list1.contains(Integer.valueOf(30)));
		System.out.println(list1);
		
	}

}