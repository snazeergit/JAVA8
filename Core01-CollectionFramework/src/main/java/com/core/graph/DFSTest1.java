package com.core.graph;

import java.util.LinkedList;
import java.util.ListIterator;

public class DFSTest1 {
	
	private Integer no_of_vertex;
	LinkedList<Integer> adjacentVertices[];
	boolean visited[];

	public DFSTest1(Integer no_of_vertex) {
		this.no_of_vertex = no_of_vertex;
		adjacentVertices = new LinkedList[no_of_vertex];
		for (int i = 0; i < adjacentVertices.length; i++) {
			adjacentVertices[i] = new LinkedList<Integer>();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		DFSTest1 g = new DFSTest1(4);
		System.out.print("Adjacent noded being added");

		// Just presentation logic to print processing dots
		for (int i = 0; i < 5; i++) {
			System.out.print(". ");
			Thread.sleep(1000);
		}

		// adding adjacent nodes to the array
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
		g.DFS(3);
	}

	private void DFS(int rootNode) {
		visited = new boolean[no_of_vertex];
		DFSUtil(rootNode, visited);

	}

	private void DFSUtil(int rootNode, boolean[] visited) {
		visited[rootNode] = true;
		System.out.print(rootNode + " ");

		ListIterator<Integer> listIterator = adjacentVertices[rootNode].listIterator();
		while (listIterator.hasNext()) {
			Integer nextNode = (Integer) listIterator.next();
			if (!visited[nextNode]) {
				DFSUtil(nextNode, visited);
			}
		}
	}

	private void addEdge(int i, int j) {
		adjacentVertices[i].add(j);
	}

}