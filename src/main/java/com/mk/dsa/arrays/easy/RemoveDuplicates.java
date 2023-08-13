package com.mk.dsa.arrays.easy;

import java.util.Arrays;

public class RemoveDuplicates {
	/*
	 * Duplicate Number
	 * Write a function which takes integer array as a parameter and returns a new
	 * integer array
	 * with unique elements. (remove duplicates)
	 * Example
	 * removeDuplicates({1, 1, 2, 2, 3, 4, 5})
	 * Output : [1, 2, 3, 4, 5]
	 */

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5 };
		System.out.println(Arrays.toString(removeDuplicates(arr)));

	}

	public static int[] removeDuplicates(int[] arr) {

		int size = arr.length;
		int[] newArr = new int[size];
		int index = 0;

		for (int i = 0; i < size; i++) {
			boolean isDuplicate = false;
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}

			// if it's NOT a duplicate, then add it to the new array
			System.out.println(isDuplicate);
			if (!isDuplicate) {
				newArr[index++] = arr[i];
			}
		}

		return Arrays.copyOf(newArr, index);
	}

}
