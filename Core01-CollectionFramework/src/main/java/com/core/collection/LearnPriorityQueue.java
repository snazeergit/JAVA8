package com.core.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(20);
		pq.offer(40);
		pq.offer(10);
		pq.offer(90);

		// By default PriorityQueue print smallest element in the Queue first rest will
		// be in random
		// order as it uses Min-Heap if you want to print max number first then use
		// Compartor.reverorder()
		System.out.println(pq);

		Queue<Integer> pq1 = new PriorityQueue<Integer>(Comparator.reverseOrder());
		pq1.offer(20);
		pq1.offer(40);
		pq1.offer(10);
		pq1.offer(90);

		// This will print max number first then use Compartor.reverorder()
		System.out.println(pq1);

		// returns head of the queue
		System.out.println(pq.peek());

		//returns and removes the head of the queue
		System.out.println(pq.poll());
		System.out.println(pq);
	}

}
