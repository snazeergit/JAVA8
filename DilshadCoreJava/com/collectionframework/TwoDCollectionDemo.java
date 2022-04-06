package com.collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Test1 {
	HashMap<Integer, String> hashMap;
	TreeMap<Integer, String> treeMap;

	void hashMapInsertion() {
		System.out.println("Test1.hashMapInsertion():");
		hashMap = new HashMap<>();
		insertion(hashMap);
		System.out.println(hashMap);
	}

	private void insertion(Map<Integer, String> map) {
		System.out.println("Test1.insertion():");
		map.put(10, "Nazeer");
		map.put(20, "Dilshad");
		map.put(50, "Sardar");
		map.put(30, "Siraj");
		map.put(90, "Shaji");
		map.put(70, "Shammu");
		map.put(40, "Sasha");
		map.put(60, "Shahina");
	}

	void treeMapInsertion() {
		System.out.println("Test1.treeMapInsertion():");
		treeMap = new TreeMap<>();
		treeMap.put(30, "Deepti");
		treeMap.putAll(hashMap);// will replace all the pre available elements from treemap means 30 deepti will
								// be removed.
		insertion(treeMap);
		System.out.println(treeMap);
	}

	public void hashMapRetrieval() {
		// TODO Auto-generated method stub
		System.out.println("Test1.hashMapRetrieval() using EntrySet:");
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();

		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) iterator.next();
			System.out.print(entry.getKey());
			System.out.print(entry.getValue() + "\t");
		}
		System.out.println();
		System.out.println("Test1.hashMapRetrieval() Using KeySet:");
		Set<Integer> keySet = hashMap.keySet();
		
		//Approach-0
		Object[] array = keySet.toArray();
		for (Object object : array) {
			System.out.print(object);
			System.out.print(hashMap.get(object)+"\t");
		}
		System.out.println();

		// Approach-1
		for (Integer key : keySet) {
			System.out.print(key);
			System.out.print(hashMap.get(key) + "\t");
		}
		System.out.println();

		// Approach-2
		Iterator<Integer> iterator1 = keySet.iterator();
		while (iterator1.hasNext()) {
			Integer integer = (Integer) iterator1.next();
			System.out.print(integer);
			System.out.print(hashMap.get(integer) + "\t");
		}
		System.out.println();
	}

	public void treeMapRetrieval() {
		// TODO Auto-generated method stub
		System.out.println("Test1.treeMapRetrieval() using EntrySet:");
		Set<Entry<Integer, String>> entrySet = treeMap.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			Map.Entry<Integer, String> mapEntry = (Map.Entry<Integer, String>) entry;
			System.out.print(mapEntry.getKey());
			System.out.print(mapEntry.getValue() + "\t");
		}
		System.out.println();
		System.out.println("Test1.treeMapRetrieval() using KeySet :");
		Set<Integer> keySet = treeMap.keySet();
		
		//Approach-0
		Object[] array = keySet.toArray();
		for (Object object : array) {
			System.out.print(object);
			System.out.print(treeMap.get(object)+"\t");
		}
		System.out.println();

		// Approach-1
		for (Integer key1 : keySet) {
			System.out.print(key1);
			System.out.print(treeMap.get(key1) + "\t");
		}
		System.out.println();

		// Approach-2
		Iterator<Integer> iterator2 = keySet.iterator();
		while (iterator2.hasNext()) {
			Integer integer = (Integer) iterator2.next();
			System.out.print(integer);
			System.out.print(treeMap.get(integer) + "\t");
		}
		System.out.println();
	}

	public void hashMapRemoval() {
		// TODO Auto-generated method stub
		System.out.println("Test1.hashMapRemoval():");

	}

	public void treeMapRemoval() {
		// TODO Auto-generated method stub
		System.out.println("Test1.treeMapRemoval():");
	}

}

public class TwoDCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TwoDCollectionDemo.main():");
		Test1 t1 = new Test1();
		t1.hashMapInsertion();
		t1.treeMapInsertion();
		t1.hashMapRetrieval();
		t1.treeMapRetrieval();
		t1.hashMapRemoval();
		t1.treeMapRemoval();
	}

}
