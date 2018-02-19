package com.intern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Program2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("AAA");
		list.add("BBB");
		list.add("BBB");
		list.add("BBB");
		list.add("CC");
		list.add("CC");
		list.add("XXX");
		list.add("XXX");
		list.add("PP");
		list.add("QQ");
		list.add("XXX");
		list.add("XXX");

		// Getting the count of elements occurs
		TreeMap<String, Integer> map = getCount(list);

		// Sorting the elements based on occurs
		List<Entry<String, Integer>> resultList = sortByValue(map);
		int count = 0;

		// Printing Top 5 elements
		for (Map.Entry<String, Integer> entry : resultList) {
			System.out.println(entry.getKey() + " ==== " + entry.getValue());
			count++;
			if (count == 5)
				break;
		}

	}

	private static TreeMap<String, Integer> getCount(List<String> list) {

		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

		for (String data1 : list) {
			int count = 0;
			for (String data2 : list) {
				if (data1.equals(data2)) {
					count++;
				}
			}
			treeMap.put(data1, count);
		}

		return treeMap;
	}

	public static List<Entry<String, Integer>> sortByValue(TreeMap<String, Integer> treeMap) {

		Set<Entry<String, Integer>> set = treeMap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);

		// Sorting based on occurs
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		return list;
	}

}
