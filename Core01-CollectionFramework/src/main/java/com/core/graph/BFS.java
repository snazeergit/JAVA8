package com.core.graph;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

class Service {
	private Integer no_of_Vertices;

	LinkedList<Integer> adjvertices[];

	public Service(int i) {
		no_of_Vertices = i;
		adjvertices = new LinkedList[no_of_Vertices];
		for (int j = 0; j < adjvertices.length; j++) {
			adjvertices[j] = new LinkedList<>();
		}
	}

	public void addEdges(int i, int j) {
		// TODO Auto-generated method stub
		adjvertices[i].add(j);
	}

	public void search_BFS(int rootNode) {
		// TODO Auto-generated method stub
		boolean[] visited = new boolean[no_of_Vertices];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(rootNode);
		while (queue.size() != 0) {
			int poll = queue.poll();
			visited[poll] = true;
			System.out.print(poll + " ");
			ListIterator<Integer> listIterator = adjvertices[poll].listIterator();
			while (listIterator.hasNext()) {
				Integer nextNode = (Integer) listIterator.next();
				if (!visited[nextNode]) {
					queue.add(nextNode);
					visited[nextNode] = true;
				}
			}

		}
	}

}

public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new Service(7);
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

		service.search_BFS(6);
	}

}
