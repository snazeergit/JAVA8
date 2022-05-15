package com.core.collection;

import java.util.Comparator;
import java.util.Stack;


//In Stack both insertion and deletion happens at same end i.e, top of the Stack.
public class LearnStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(30);
		s.push(90);
		s.push(20);
		System.out.println(s);
		
		//sorting
		s.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		System.out.println(s);
		
		//returns top element in the Stack
		System.out.println(s.peek());
		System.out.println(s);
		
		//removes and returns the top element in the Stack
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
	}

}
