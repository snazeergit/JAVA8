package com.Dilshad;

import java.util.Scanner;

public class CollectionDemo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int arraySize=scanner.nextInt();
		int[] intArray = new int[arraySize];
		
		//Insertion
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Enter a value");
			int ik = scanner.nextInt();
			intArray[i] = ik;
		}
		//Fetching/Retrieving
		System.out.print("{");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
			System.out.print(",");
		}
		System.out.print("\b");
		System.out.print("}");
	}
}
