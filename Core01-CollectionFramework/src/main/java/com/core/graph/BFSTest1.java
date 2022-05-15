package com.core.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFSTest1 {

	private Integer noOfVertices;
	private LinkedList<Integer> adjacent[];

	public BFSTest1(Integer v) {
		noOfVertices = v;
		adjacent = new LinkedList[v];
		for (int i = 0; i < adjacent.length; i++) {
			adjacent[i] = new LinkedList<Integer>();
		}
	}

	public static void main(String[] args) {
		BFSTest1 l1 = new BFSTest1(7);
		l1.addEdges(0, 1);
		l1.addEdges(0, 3);
		l1.addEdges(1, 3);
		l1.addEdges(1, 2);
		l1.addEdges(1, 5);
		l1.addEdges(2, 1);
		l1.addEdges(2, 3);
		l1.addEdges(2, 4);
		l1.addEdges(2, 5);
		l1.addEdges(3, 1);
		l1.addEdges(3, 2);
		l1.addEdges(3, 4);
		l1.addEdges(4, 3);
		l1.addEdges(4, 2);
		l1.addEdges(4, 6);
		l1.addEdges(5, 1);
		l1.addEdges(5, 2);

		l1.bsf(2);

	}

	private void bsf(int currentVertex) {
		boolean visited[] = new boolean[noOfVertices];
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(currentVertex);
		visited[currentVertex] = true;

		while (queue.size() != 0) {
			
			Integer visitedVertex = queue.poll();
			System.out.print(visitedVertex + " ");
			Iterator<Integer> iterator = adjacent[visitedVertex].iterator();
			while (iterator.hasNext()) {
				Integer integer = iterator.next();
				if (!visited[integer]) {
					visited[integer] = true;
					queue.add(integer);
				}
			}
		}
	}

	private void addEdges(int i, int j) {
		// This will add an element to the first linkedlist
		adjacent[i].add(j);
	}

}
