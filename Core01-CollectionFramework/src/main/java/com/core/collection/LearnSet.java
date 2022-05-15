package com.core.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		System.out.println("Unique elements but Insertion order is not preserved");
		Set<Integer> hset = new HashSet<Integer>();
		hset.add(20);
		hset.add(20);
		hset.add(90);
		hset.add(30);
		hset.add(70);
		hset.add(60);
		hset.add(10);
		hset.add(40);
		hset.add(50);
		hset.add(80);
		hset.add(100);
		System.out.println(hset);
		System.out.println(hset.contains(90));
		System.out.println(hset.isEmpty());
		System.out.println(hset.size());
		hset.clear();
		System.out.println(hset);

		System.out.println("===========================================");

		System.out.println("Unique elements and Insertion order is preserved");
		Set<Integer> lhset = new LinkedHashSet<Integer>();
		lhset.add(20);
		lhset.add(20);
		lhset.add(90);
		lhset.add(30);
		lhset.add(70);
		lhset.add(60);
		lhset.add(10);
		lhset.add(40);
		lhset.add(50);
		lhset.add(80);
		lhset.add(100);
		System.out.println(lhset);
		System.out.println(lhset.contains(90));
		System.out.println(lhset.isEmpty());
		System.out.println(lhset.size());
		lhset.clear();
		System.out.println(lhset);

		System.out.println("===========================================");

		System.out.println("Unique elements and Sorted order is preserved");
		Set<Integer> tset = new TreeSet<Integer>();
		tset.add(20);
		tset.add(20);
		tset.add(90);
		tset.add(30);
		tset.add(70);
		tset.add(60);
		tset.add(10);
		tset.add(40);
		tset.add(50);
		tset.add(80);
		tset.add(100);
		System.out.println(tset);
		System.out.println(tset.contains(90));
		System.out.println(tset.isEmpty());
		System.out.println(tset.size());
		tset.clear();
		System.out.println(tset);
	}

}
