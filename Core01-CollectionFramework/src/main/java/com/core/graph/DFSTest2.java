package com.core.graph;

import java.util.LinkedList;
import java.util.ListIterator;

public class DFSTest2 {
	private Integer vertices;
	private LinkedList<Integer>[] adjVertices;

	public DFSTest2(Integer vertices) {
		this.vertices = vertices;
		adjVertices = new LinkedList[vertices];
		for (int i = 0; i < adjVertices.length; i++) {
			adjVertices[i] = new LinkedList<Integer>();
		}
	}

	public static void main(String[] args) {

		DFSTest2 g = new DFSTest2(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
		g.DFS(2);

	}

	private void DFS(int rootNode) {
		boolean[] visited = new boolean[vertices];
		DFSTraversal(rootNode, visited);
	}

	private void DFSTraversal(int rootNode, boolean[] visited) {
		visited[rootNode] = true;
		System.out.print(rootNode+" ");
		
		ListIterator<Integer> listIterator = adjVertices[rootNode].listIterator();
		while (listIterator.hasNext()) {
			Integer nextNode = (Integer) listIterator.next();
			if (!visited[nextNode]) {
				DFSTraversal(nextNode, visited);
			}
		}
	}

	private void addEdge(int i, int j) {
		adjVertices[i].add(j);
	}

}
