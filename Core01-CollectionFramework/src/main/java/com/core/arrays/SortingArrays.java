package com.core.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrays {

	public static void main(String[] args) {
		Integer[] ar = { 15, 118, 35, 29, 174, 109, 21, 92, 1, 100 };
		for (Integer integer : ar) {
			System.out.print(integer + "  ");
		}

		Arrays.sort(ar);
		System.out.println();
		for (Integer integer : ar) {
			System.out.print(integer + "  ");
		}

		Arrays.sort(ar, Collections.reverseOrder());
		System.out.println();
		for (Integer integer : ar) {
			System.out.print(integer + "  ");
		}
	}

}
