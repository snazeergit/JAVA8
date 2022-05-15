package com.core.graph.usecases;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//shortest path between source and destination vertex and printing the distance 
public class BFSTest {

	private LinkedList<Integer> adj[];
	private Integer noOfVertices;

	// creating adjacent array of LinkedList
	public BFSTest(Integer vertices) {
		noOfVertices = vertices;
		adj = new LinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}

	// adding adjacent node details to adjacent array
	public void addEdge(int source, int desti) {
		adj[source].add(desti);
		adj[desti].add(source);
	}

	private int breadthFirstSearch(int sourceVertex, int destinationVertex) {

		boolean[] visited = new boolean[noOfVertices];
		int[] parent = new int[noOfVertices];
		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(sourceVertex);
		visited[sourceVertex] = true;
		parent[sourceVertex] = -1;

		while (!queue.isEmpty()) {
			int currentVertex = queue.poll();
			if (currentVertex == destinationVertex)
				break;

			for (int neighbourVertex : adj[currentVertex]) {
				if (!visited[neighbourVertex]) {
					queue.add(neighbourVertex);
					visited[neighbourVertex] = true;
					parent[neighbourVertex] = currentVertex;
				}
			}
		}

		int currentVertex = destinationVertex;
		int distance = 0;

		while (parent[currentVertex] != -1) {
			System.out.print(currentVertex + " <- ");
			currentVertex = parent[currentVertex];
			distance++;
		}
		System.out.println(sourceVertex);

		return distance;
	}

	private void printAdj(LinkedList<Integer>[] adj2) {
		System.out.print("[");
		for (int i = 0; i < adj2.length; i++) {
			System.out.print("[");
			LinkedList<Integer> linkedList = adj[i];
			for (Integer integer : linkedList) {
				System.out.print(integer + " ");
			}
			System.out.print("]");

		}
		System.out.println("]");
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no.of Vertices and Edges :");
		int vertices = s.nextInt();
		int edges = s.nextInt();

		BFSTest t = new BFSTest(vertices);

		System.out.println("Enter the " + edges + " edges : ");
		for (int i = 0; i < edges; i++) {
			t.addEdge(s.nextInt(), s.nextInt());
		}

		System.out.print("Adjcent array formed : ");
		t.printAdj(t.adj);

		System.out.println("Enter Source and Destination :");
		int distance = t.breadthFirstSearch(s.nextInt(), s.nextInt());
		System.out.println("Minimum distance is : " + distance);
		s.close();
	}

}
