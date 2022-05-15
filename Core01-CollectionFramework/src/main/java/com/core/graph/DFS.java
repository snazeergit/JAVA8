package com.core.graph;

import java.util.LinkedList;
import java.util.ListIterator;

class DFSService {
	private Integer vertices;
	private LinkedList<Integer>[] adjVertices;
	boolean[] visited;

	public DFSService(Integer vertices) {
		this.vertices = vertices;
		visited = new boolean[vertices];
		adjVertices = new LinkedList[vertices];
		for (int i = 0; i < adjVertices.length; i++) {
			adjVertices[i] = new LinkedList<Integer>();
		}
	}

	public void DFSTraversal(int rootNode, boolean[] visited) {
		visited[rootNode] = true;
		System.out.print(rootNode + " ");

		ListIterator<Integer> listIterator = adjVertices[rootNode].listIterator();
		while (listIterator.hasNext()) {
			Integer nextNode = (Integer) listIterator.next();
			if (!visited[nextNode]) {
				DFSTraversal(nextNode, visited);
			}
		}
	}

	public void addEdges(int i, int j) {
		adjVertices[i].add(j);
	}
}

public class DFS {
	public static void main(String[] args) {

		DFSService service = new DFSService(7);
		
		service.addEdges(1, 2);
		service.addEdges(1, 3);

		service.addEdges(2, 1);
		service.addEdges(2, 4);
		service.addEdges(2, 5);

		service.addEdges(3, 1);
		service.addEdges(3, 5);

		service.addEdges(4, 2);
		service.addEdges(4, 5);
		service.addEdges(4, 6);

		service.addEdges(5, 2);
		service.addEdges(5, 3);
		service.addEdges(5, 4);
		service.addEdges(5, 6);

		service.addEdges(6, 4);
		service.addEdges(6, 5);

		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
		service.DFSTraversal(2, service.visited);

	}
}
