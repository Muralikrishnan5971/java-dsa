package com.mk.dsa.arrays;

public class TwoDimensionArray {
    int arr[][] = null;

    // constructor
    public TwoDimensionArray(int rows, int cols){
        arr = new int[rows][cols];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
            
        }
    }

    // insert a value to the array at given index
    public void insertValueInArray(int rowIndex, int colIndex, int valueToBeInserted){
        // All line in this method has a time complexity of O(1), hence the total
        // time complexity of this method is O(1)
        try {
            if(arr[rowIndex][colIndex] == Integer.MIN_VALUE){
                arr[rowIndex][colIndex] = valueToBeInserted;
                System.out.println("Insertion Successful");
            } else {
                System.out.println("The cell is already occupied");
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid Index for 2D array!");
        }
    }

    // accessing cell value from given array
    public void getValueInArray(int rowIndex, int colIndex){
        System.out.println("\nAccessing Row# " + rowIndex + ", Col# " + colIndex);
        try {
            System.out.println("The cell value is: " + arr[rowIndex][colIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid Index for 2D array!");
        }
    }

    // traversing 2d array
    public void traverse2DArray(){
        // total time complexity will be O(mn)
        for (int row = 0; row < arr.length; row++) {            // O(m)
            for (int col = 0; col < arr[0].length; col++) {     // O(n)   
                System.out.println(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    // searching 2d array
    public void searchGivenValue(int valueToBeSearched){
        // total time complexity will be O(mn)
        for (int row = 0; row < arr.length; row++) {            // O(m)
            for (int col = 0; col < arr[0].length; col++) {     // O(n)   
                if(arr[row][col] == valueToBeSearched){
                    System.out.println("Value is found at row: " + row + " and " + col);
                    return;
                }
            }
        }
        System.err.println("The value is not found!");
    }

    // deleting a value from the array
    public void deleteValueFromArray(int valueToBeDeleted){
        // total time complexity will be O(mn)
        for (int row = 0; row < arr.length; row++) {            // O(m)
            for (int col = 0; col < arr[0].length; col++) {     // O(n)   
                if(arr[row][col] == valueToBeDeleted){
                    arr[row][col] = Integer.MIN_VALUE;
                    System.out.println("Deletion Successful!");
                    return;
                }
            }
        }
    }

    // deleting a value by index
    public void deleteValueByIndex(int row, int col){
        // All line in this method has a time complexity of O(1), hence the total
        // time complexity of this method is O(1)
        try {
            arr[row][col] = Integer.MIN_VALUE;
            System.out.println("Deletion Successful!");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid Index!");
        }
    }
}
