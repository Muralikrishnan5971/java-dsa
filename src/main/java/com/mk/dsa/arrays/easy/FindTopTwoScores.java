package com.mk.dsa.arrays.easy;

import java.util.Arrays;

public class FindTopTwoScores {
	/*
	 * Given an array, write a function to get first,
	 * second best scores from the array and return it in new array.
	 * Array may contain duplicates.
	 * Example
	 * myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
	 * firstSecond(myArray) // {90, 87}
	 */
	public static void main(String[] args) {

		int[] numbers = { 84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0 };
		System.out.println(Arrays.toString(findTopTwoScores(numbers)));

	}

	public static int[] findTopTwoScores(int[] numbers) {

		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int num : numbers) {
			if (num > firstMax) {
				secondMax = firstMax;
				firstMax = num;
			} else if (num > secondMax) {
				secondMax = num;
			}
		}
		return new int[] { firstMax, secondMax };
	}
}
