package com.core.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

	int[] inputArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayRotation a = new ArrayRotation();
		System.out.println("Enter the number to rotate the array : ");
		a.rotateArray(new Scanner(System.in).nextInt());
	}

	public void rotateArray(int rotation) {
		int arrLen = inputArray.length;// size:7

		int[] array1 = new int[rotation];// size:2 elements -> 1,2
		int[] array2 = new int[arrLen - rotation];// size:5 elements -> 3,4,5,6,7
		int[] outputArray = new int[inputArray.length];// size:7

		for (int j = 0; j < array1.length; j++) {
			array1[j] = inputArray[j];
		}
		System.out.println(Arrays.toString(array1));

		int i = 0;
		// starts from index 2 to 5
		for (int j = array1.length; j < inputArray.length; j++) {
			array2[i] = inputArray[j];
			i++;
		}
		System.out.println(Arrays.toString(array2));

		System.arraycopy(array2, 0, outputArray, 0, array2.length);
		System.arraycopy(array1, 0, outputArray, array2.length, array1.length);

		System.out.println("Array is rotated by " + rotation + " elements : " + Arrays.toString(outputArray));

		inputArray = outputArray = array1 = array2 = null;

	}

}
