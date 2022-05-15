package com.core.collection;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(90);
		q.offer(30);
		q.offer(60);
		q.offer(70);
		System.out.println(q);
		
		//returns head of the queue
		System.out.println(q.peek());
		
		//removes and returns head of the queue
		System.out.println(q.poll());
		
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}

}
