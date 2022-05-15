package com.core.collection;

import java.util.ArrayDeque;

public class LearnArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.offer(20);
		q.offer(30);
		q.offer(40);
		System.out.println(q);
		// add element to head of the queue
		q.offerFirst(10);

		// add element to tail of the queue
		q.offerLast(50);
		System.out.println(q);

		// peek and peekFirst fetch head of the queue
		System.out.println(q.peek());
		System.out.println(q.peekFirst());

		// peek and peekFirst fetch tail of the queue
		System.out.println(q.peekLast());
		System.out.println(q);

		// poll and pollFirst removes and returns the head of the queue
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.pollFirst());
		System.out.println(q);

		// poll and pollFirst removes and returns the tail of the queue
		System.out.println(q.pollLast());
		System.out.println(q);

	}

}
