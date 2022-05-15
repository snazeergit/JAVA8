package com.datastructures.greatLearning;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class PlanningUtil {
	private int floors;
	Scanner scanner;
	Map<Integer, Integer> hmap;
	PriorityQueue<Integer> que;
	int fSize;
	Integer[] storeFloors;

	public PlanningUtil(int floors, Scanner scanner) {
		this.floors = floors;
		this.scanner = scanner;
		storeFloors = new Integer[floors + 1];
		Arrays.fill(storeFloors, 0);
	}

	public void printFloors() {
		hmap = new HashMap<Integer, Integer>();
		que = new PriorityQueue<>(Comparator.reverseOrder());

		for (int i = 1; i <= floors; i++) {
			System.out.println("Enter the floor size given on day :" + i);
			fSize = scanner.nextInt();
			hmap.put(i, fSize);
			que.offer(fSize);
		}

		System.out.println("Input : " + hmap);
		System.out.println();
		System.out.println("Order of construction is as follows");

		for (int j = 1; j <= floors; j++) {
			System.out.println();
			System.out.println("Day :" + j);
			int k = hmap.get(j);
			if (k == que.peek()) {
				storeFloors[j] = k;
				print();
				Arrays.fill(storeFloors, 0);
			} else {
				storeFloors[j] = k;
			}
		}
		print();
	}

	public void print() {
		Arrays.sort(storeFloors, Collections.reverseOrder());
		for (int st : storeFloors) {
			if (st != 0) {
				System.out.print(st + " ");
			}
		}
	}
}

public class FloorPlanning {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");

		int floors = Integer.parseInt(scanner.nextLine());
		PlanningUtil util = new PlanningUtil(floors, scanner);

		util.printFloors();

		scanner.close();
	}

}
