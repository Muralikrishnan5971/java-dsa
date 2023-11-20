package com.mk.dsa.arrays.array_projects;

public class BinarySearch {

	/*
	 * Binary search is applicable for all SORTED associations.
	 * 
	 */

	public static void main(String[] args) {

		int[] arr = { 3, 4, 6, 7, 9, 12, 16, 18 }; // Sorted

		System.out.println(BinarySearch.binarySearch(arr, 7));
	}

	public static int binarySearch(int[] arr, int x) {

		int l = 0;
		int h = arr.length - 1;

		while (l <= h) {

			int m = ((l + h) / 2);

			if (arr[m] == x) {
				return m; // Target found
			} else if (arr[m] < x) {
				l = m + 1; // Search in the right half
			} else {
				h = m - 1; // Search in the left half
			}

		}

		return -1; // Target not found
	}
}
