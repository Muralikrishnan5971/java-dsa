package com.mk.dsa.arrays.easy;

public class FindMissingNumber {
	/*
	 * Write Java function called findMissingNumberInArray that takes an integer
	 * array containing n-1 unique elements from a range of 1 to n, with one missing
	 * number,and returns the missing number.
	 * Example
	 * myArray = {1,2,3,4,6}
	 * findMissingNumberInArray(myArray, 6) // 5
	 * Hint:
	 * Use the formula (n * (n + 1)) / 2 which calculates the sum of the first n
	 * natural numbers.
	 */

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 5, 4, 6, 8, 9, 10 };
		System.out.println(findMissingNumberInArray(num));
	}

	public static int findMissingNumberInArray(int[] arr) {
		int sumOfArray = 0;
		for (int i = 0; i < arr.length; i++) {
			sumOfArray += arr[i];
		}
		int numOfElements = arr.length + 1;
		int totalSum = (numOfElements * (numOfElements + 1)) / 2;
		return totalSum - sumOfArray;
	}
}
