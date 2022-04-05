package com.collectionframework;

import java.util.HashMap;
import java.util.TreeMap;

class Test1 {
	HashMap<Integer, String> hashMap;
	TreeMap<Integer, String> treeMap;

	void hashMapInsertion() {
		hashMap = new HashMap<>();
		hashMap.put(10, "Nazeer");
		hashMap.put(20, "Dilshad");

		System.out.println(hashMap);
	}

	void treeMapInsertion() {
		treeMap = new TreeMap<>();
		treeMap.put(30, "Deepti");
		treeMap.putAll(hashMap);// will replace all the pre available elements from treemap means 30 deepti will
								// be removed.

		System.out.println(hashMap);
	}

	public void hashMapRetrieval() {
		// TODO Auto-generated method stub

	}

	public void treeMapRetrieval() {
		// TODO Auto-generated method stub

	}

	public void hashMapRemoval() {
		// TODO Auto-generated method stub
		
	}

	public void treeMapRemoval() {
		// TODO Auto-generated method stub
		
	}

}

public class TwoDCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		t1.hashMapInsertion();
		t1.treeMapInsertion();
		t1.hashMapRetrieval();
		t1.treeMapRetrieval();
		t1.hashMapRemoval();
		t1.treeMapRemoval();		
	}

}
