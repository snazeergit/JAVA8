package com.nazeer.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*class MyComparator2 implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub

		return (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0;
	}
}*/

public class DemoCollection3 {

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
		
		Comparator<Integer> comparator = (i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0;
		Collections.sort(l, comparator);

		//The above lines can be shortly written as below.
//		Collections.sort(l, (i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0);
		System.out.println(l);
	}

}
