package com.core.arrays;

import java.util.Scanner;

public class MultiDimentionalArray {

	int[][] twoDArr = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } };

	int[][][] threeDArr = { { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } },
			{ { 11, 12, 13 }, { 14, 15, 16, }, { 17, 18, 19 } }, { { 21, 22, 23 }, { 24, 25, 26, }, { 27, 28, 29 } } };

	public static void main(String[] args) {

		MultiDimentionalArray m = new MultiDimentionalArray();
		m.twoDArray();
		m.threeDArray();
		m.printElementAtSpecificIndex();

	}

	// 2D array printing
	public void twoDArray() {
		System.out.println("2-D Array 3x3 :");

		for (int i = 0; i < twoDArr.length; i++) {
			for (int j = 0; j < twoDArr[i].length; j++) {
				System.out.print(twoDArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	// 3D array printing
	public void threeDArray() {
		System.out.println("3-D Array 3x3x3 :");

		for (int i = 0; i < threeDArr.length; i++) {
			for (int j = 0; j < threeDArr[i].length; j++) {
				for (int k = 0; k < threeDArr[i][j].length; k++) {
					System.out.print(threeDArr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	// Printing element at a specific index
	public void printElementAtSpecificIndex() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter only values range from 0 to 2 for l,b,h variables below");
		System.out.println("enter l");
		int l = s.nextInt();
		System.out.println("enter b");
		int b = s.nextInt();
		System.out.println("enter h");
		int h = s.nextInt();
		System.out.println("Element requested : [" + l + "][" + b + "][" + h + "] : "+threeDArr[l][b][h]);

		s.close();
	}
}
