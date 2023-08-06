package com.mk.dsa.arrays;

public class SingleDimensionArray {
    int arr[] = null;

    // constructor to initialize our array
    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MAX_VALUE;       // initialize the array with java Integer constant MAX_VALUE
        }
    }

    // This implementation of insert method has an O(1) time complexity
    public void insert(int index, int valueToBeInserted){
        try {
            if(arr[index] == Integer.MAX_VALUE){
                arr[index] = valueToBeInserted;
                System.out.println("Insertion Successfull");
            } else {
                System.err.println("Cell already Occupied!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid Index!");
        }
    }

    // traverse and print all array elements
    public void traverseArray(){
        try{
            // O(n) time complexity
            for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        } catch (Exception e) {
            System.err.println("Array no longer exists!");
        }
    }

    // search for an element in the array
    public void searchArray(int valueToSearch){
        // O(n) time complexity
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == valueToSearch){
               System.out.println("Value is found at the index of: " + i);
               return;
            }            
        }
        System.out.println(valueToSearch + " is not found");
    }

    // delete a particular value from the array
    public void deleteByIndex(int index){
        try {
            // O(n) time complexity
            arr[index] = Integer.MAX_VALUE; 
            System.out.println("Deletion successfull");  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid Index!");
        }
        
    }

}
