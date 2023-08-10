package com.mk.dsa.arrays.easy;

public class SumOfDiagonal {
	/*
	 * Given 2D array calculate the sum of diagonal elements.
	 * Example
	 * myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
	 * sumDiagonalElements(myArray2D) # 15
	 */

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(sumOfDiagonalElementsUsingTwoLoops(arr));
		System.out.println(sumOfDiagonalElementsUsingOneLoop(arr));
	}

	public static int sumOfDiagonalElementsUsingTwoLoops(int[][] arr) {
		if (arr.length != arr[0].length) {
			System.err.println("Please enter a valid 2D array!");
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == j) {
					sum += arr[i][j];
				}
			}
		}
		return sum;
	}

	public static int sumOfDiagonalElementsUsingOneLoop(int[][] arr) {
		if (arr.length != arr[0].length) {
			System.err.println("Please enter a valid 2D array!");
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][i];
		}
		return sum;
	}

}
