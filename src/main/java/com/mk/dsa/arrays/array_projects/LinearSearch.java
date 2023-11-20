package com.mk.dsa.arrays.array_projects;

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		System.out.println(LinearSearch.search(arr, 1));

	}

	public static boolean search(int[] arr, int number) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == number) {
				return true;

			}
		}
		return false;
	}
}
