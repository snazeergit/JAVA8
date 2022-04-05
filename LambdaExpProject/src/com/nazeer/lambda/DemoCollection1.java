package com.nazeer.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		if (i1 < i2) {
			return -1;
		} else if (i1 > i2) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class DemoCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(10);
		l.add(60);
		l.add(50);
		l.add(40);
		l.add(90);
		System.out.println(l);
		// Collections.sort(l);
		Collections.sort(l, new MyComparator());
		System.out.println(l);
	}

}
