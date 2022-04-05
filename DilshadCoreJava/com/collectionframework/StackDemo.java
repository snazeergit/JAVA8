package com.collectionframework;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {


	// Main Method
	public static void main(String args[])
	{
		Stack<String> stack = new Stack<String>();
		stack.push("Geeks1");
		stack.push("Geeks2");
		stack.push("Geeks3");

		// Iterator for the stack
		Iterator<String> itr = stack.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		//remove the last element from the stack
		stack.pop();
		

		// Iterator for the stack after removing an element using pop()
		itr = stack.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
