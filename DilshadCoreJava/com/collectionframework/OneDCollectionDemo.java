package com.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

class Test {
	LinkedList<Integer> linkedList;
	ArrayList<Integer> arrayList;
	HashSet<Integer> hashSet;
	TreeSet<Integer> treeSet;

	void linkedListInsertion() {
		// TODO
		linkedList = new LinkedList<Integer>();
		System.out.println("Adding elements to LinkedList");
		linkedList.add(10);
		linkedList.add(1, 30);
		System.out.println(linkedList);

		linkedList.addFirst(20);
		linkedList.addLast(40);
		System.out.println(linkedList);

		Object linkedListClone = linkedList.clone();
		System.out.println(linkedList);

		
		  Collection<Integer> collection = (Collection<Integer>) linkedListClone;
		  linkedList.addAll((Collection<Integer>) collection);
		  System.out.println(linkedList);
		 

		linkedList.add(1, 60);
		System.out.println(linkedList);
	}

	void arrayListInsertion() {
		// TODO
		arrayList = new ArrayList<>();
		System.out.println();
		System.out.println("Adding elements to ArrayList");
		arrayList.add(10);
		arrayList.add(1, 20);
		System.out.println(arrayList);
		arrayList.addAll(linkedList);
		arrayList.addAll(2, linkedList);
		System.out.println(arrayList);
	}

	void hashSetInsertion() {
		System.out.println();
		System.out.println("Adding elements to HashSet");
		hashSet = new HashSet<>();
		hashSet.add(10);
		hashSet.addAll(linkedList);
		hashSet.addAll(arrayList);
		System.out.println(hashSet);
	}

	void treeSetInsertion() {
		System.out.println("Adding elements to TreeSet");
		treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.addAll(arrayList);
		System.out.println(treeSet);
	}

	void linkedListRetrieval() {
		// TODO
		System.out.println("Fetching using Iterator:");
		Iterator<Integer> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		System.out.println();
		System.out.println("Fetching using ListIterator:");
		ListIterator<Integer> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + "\t");
		}
		System.out.println();
		System.out.println("Fetching using toArray():");
		Object[] array = linkedList.toArray();
		for (Object object : array) {
			System.out.print(object + "\t");
		}
	}

	void arrayListRetrieval() {
		// TODO
		System.out.println("Fetching using Iterator:");
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		System.out.println();
		System.out.println("Forward Fetching using ListIterator:");
		ListIterator<Integer> listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + "\t");
		}
		System.out.println();
		System.out.println("Backword Fetching using ListIterator:");
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + "\t");

		}
		System.out.println();
		System.out.println("Fetching using toArray():");
		Object[] array = arrayList.toArray();
		for (Object object : array) {
			System.out.print(object + "\t");
		}

	}

	void hashSetRetrieval() {
		System.out.println("HashSet retirieval");
		Iterator<Integer> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + "\t");
		}
	}

	void treeSetRetrieval() {
		System.out.println();
		System.out.println("TreeSet Retrival");
		Iterator<Integer> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + "\t");
		}
	}

	void linkedListRemoval() {
		System.out.println();
		System.out.println("Removal using Linkedlist");
		linkedList.remove();
		linkedList.remove(1);
		linkedList.removeFirst();
		linkedList.removeLast();
		linkedList.removeAll(linkedList);
		System.out.println(linkedList);
	}

	void arrayListRemoval() {
		System.out.println();
		System.out.println("Removal using ArrayList");
		arrayList.remove(0);
		arrayList.removeAll(arrayList);
		System.out.println(arrayList);

	}

	void hashSetRemoval() {
		System.out.println();
		System.out.println("HashSet Removal");
		hashSet.remove(10);
		hashSet.removeAll(hashSet);
		System.out.println(hashSet);
	}

	void treesetRemoval() {
		System.out.println();
		System.out.println("TreeSet removal");
		treeSet.remove(10);
		treeSet.removeAll(treeSet);
		System.out.println(treeSet);
	}
}

public class OneDCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();

		t1.linkedListInsertion();
		t1.linkedListRetrieval();
		// t1.linkedListRemoval();

		t1.arrayListInsertion();
		t1.arrayListRetrieval();
		// t1.arrayListRemoval();

		t1.hashSetInsertion();
		t1.treeSetInsertion();
		// t1.hashSetRemoval();

		t1.hashSetRetrieval();
		t1.treeSetRetrieval();
		// t1.treesetRemoval();

	}

}
