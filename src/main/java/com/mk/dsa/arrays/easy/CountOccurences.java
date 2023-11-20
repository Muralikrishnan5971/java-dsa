package com.mk.dsa.arrays.easy;

import java.util.HashMap;

public class CountOccurences {

	public static void main(String[] args) {

		// Sorted Array
		int[] arr = { 1, 1, 1, 2, 4, 4, 4, 4, 4 };
		System.out.println(countOccurences(arr, 2));
	}

	public static int countOccurences(int[] arr, int x) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : arr) {
			if (map.containsKey(i)) {

				map.put(i, map.get(i) + 1);
			} else {

				map.put(i, 1);
			}
		}

		return map.get(x);
	}
}
