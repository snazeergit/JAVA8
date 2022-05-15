package com.core.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class BFSTraversal {
	private Integer vertexSize;
	LinkedList<Integer> adjVertices[];

	// Array of LinkedList is created with vertexSize to hold adjacent vertices of
	// the each vertex
	public BFSTraversal(int i) {
		vertexSize = i;
		adjVertices = new LinkedList[vertexSize];
		for (int j = 0; j < adjVertices.length; j++) {
			adjVertices[j] = new LinkedList<Integer>();
		}
	}

	public void addEdges(int i, int j) {
		adjVertices[i].add(j);
	}

	public void traversalBSF(int startVertex) {
		boolean visited[] = new boolean[vertexSize];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[startVertex] = true;
		queue.add(startVertex);

		while (queue.size() != 0) {
			startVertex = queue.poll();
			System.out.print(startVertex + " ");
			Iterator<Integer> iterator = adjVertices[startVertex].listIterator();
			while (iterator.hasNext()) {
				Integer integer = iterator.next();
				if (!visited[integer]) {
					visited[integer] = true;
					queue.add(integer);
				}
			}
		}
	}
}

public class LearningBSF {

	public static void main(String[] args) {

		BFSTraversal l1 = new BFSTraversal(7);

		// Adding adjacent vertices of each vertex to the adjacent array created
		l1.addEdges(0, 1);
		l1.addEdges(0, 3);
		l1.addEdges(1, 0);
		l1.addEdges(1, 3);
		l1.addEdges(1, 2);
		l1.addEdges(1, 5);
		l1.addEdges(2, 1);
		l1.addEdges(2, 3);
		l1.addEdges(2, 4);
		l1.addEdges(2, 5);
		l1.addEdges(3, 0);
		l1.addEdges(3, 1);
		l1.addEdges(3, 2);
		l1.addEdges(3, 4);
		l1.addEdges(4, 3);
		l1.addEdges(4, 2);
		l1.addEdges(4, 6);
		l1.addEdges(5, 1);
		l1.addEdges(5, 2);
		l1.addEdges(6, 1);
		l1.addEdges(6, 4);

		// Reading the vertex to number to start as a root node
		System.out.println("Enter the root node for BFS");
		int rootNode = new Scanner(System.in).nextInt();
		if (rootNode < 7) {
			System.out.print("Breadth First Search '" + rootNode + "' as a root node : ");
			// Start BFS traversal
			l1.traversalBSF(rootNode);
		} else {
			System.out.println("Please enter the valid vertex numbers ranging from [0,1,2,3,4,5] :");

		}

	}
}
