package com.core.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("India1", 101);
		map.put("India2", 102);
		map.put("India3", 103);

		System.out.println(map);

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.err.println("entrySet()");
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		Set<String> keySet = map.keySet();
		System.err.println("keySet()");
		for (String key : keySet) {
			System.out.print(key + "->");
			System.out.println(map.get(key));
		}

		Collection<Integer> values = map.values();
		System.err.println("values()");
		for (Integer value : values) {
			System.out.print(value);
		}

	}

}
