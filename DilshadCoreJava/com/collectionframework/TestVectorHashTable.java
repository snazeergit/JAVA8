package com.collectionframework;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Vector;

public class TestVectorHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creation of an array, vector and hash table
		int[] arr = new int[3];
		Vector<String> vector = new Vector<String>();
		Hashtable<String, Integer> hashtable = new Hashtable<>();

		// adding elements
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element for an array");
			int j = s.nextInt();
			arr[i] = j;
		}
		vector.addElement("nazeer");
		hashtable.put("nazeer", 30);

		// fetching elements
		System.out.println("Printing Array elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		System.out.println(vector.get(0));
		System.out.println(hashtable.get("nazeer"));

	}

}
