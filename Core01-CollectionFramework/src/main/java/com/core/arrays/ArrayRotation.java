package com.core.arrays;

import java.util.Arrays;

/**
 * public static void arraycopy(Object source_arr, int sourcePos, Object dest_arr, int destPos, int len)
 * 
 * source_arr : array to be copied from 
 * sourcePos : starting position in source array from where to copy 
 * dest_arr : array to be copied in 
 * destPos : starting position in destination array, where to copy in 
 * len : total no. of components to be copied.
 */

public class ArrayRotation {

	int[] inputArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ArrayRotation a = new ArrayRotation();

		// a.rotateArray1(2);
		// a.rotateArray2(3);
		// a.rotateArray3(4);
		a.rotateArray4(10);
	}

	public void rotateArray4(int rotation) throws InterruptedException {
		int[] tempArray = new int[inputArray.length];
		for (int i = 1; i <= rotation; i++) {
			System.arraycopy(inputArray, i, tempArray, 0, inputArray.length - i);
			System.arraycopy(inputArray, 0, tempArray, inputArray.length - i, i);
			System.out.println(Arrays.toString(tempArray));
			Thread.sleep(700);
		}
	}

	public void rotateArray3(int rotation) {
		int[] tempArray = new int[inputArray.length];

		System.arraycopy(inputArray, rotation, tempArray, 0, inputArray.length - rotation);
		System.arraycopy(inputArray, 0, tempArray, inputArray.length - rotation, rotation);
		System.out.println(Arrays.toString(tempArray));
	}

	public void rotateArray2(int rotation) {
		int[] tempArray = new int[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray.length > i + rotation) {
				tempArray[i] = inputArray[i + rotation];
			}
		}
		System.out.println(Arrays.toString(tempArray));
		int j = 0;
		for (int i = inputArray.length - rotation; i < inputArray.length; i++) {
			tempArray[i] = inputArray[j];
			j++;
		}
		System.out.println(Arrays.toString(tempArray));

	}

	public void rotateArray1(int rotation) {
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
		// 0-2 //2-2
		System.arraycopy(array2, 0, outputArray, 0, array2.length);
		System.arraycopy(array1, 0, outputArray, array2.length, array1.length);

		System.out.println("Array is rotated by " + rotation + " elements : " + Arrays.toString(outputArray));

		inputArray = outputArray = array1 = array2 = null;

	}

}
