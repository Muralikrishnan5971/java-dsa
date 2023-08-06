package com.mk.dsa.arrays;

import java.util.Arrays;

public class ArrayConcept{

    /*
     * An array can contain primitives (int, char, etc.) and object (or non-primitive) references 
     * of a class depending on the definition of the array. In the case of primitive data types, 
     * the actual values are stored in contiguous memory locations. In the case of class objects, 
     * the actual objects are stored in a heap segment
     */

     int intArray[]; // Array declaration
     int[] arrayInt[]; //Another way to decalre array

     int[] newArray = new int[10];  // when we know the array size

     public static void createNewArray(){

    /* Creating an array involves three steps

    1. Declaring
    2. Instantiating
    3. Initialization

    We cannot print array directly to console, we need to use Arrays class

    The first method will take O(n) time complexity as O(1) increase as size of array increases.
    since here size n = 6, each assigement step is of O(1) complexity, leading to a total
    of O(n) complexity.

    Whereas in the last two ways, where everything is done in a single line,
    it has a time complexity of O(1).

     */
        int[] arr;          // Declaring
        arr = new int[6];   // Instantiating
        arr[0] = 10;        // Initialisation
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        System.out.println(Arrays.toString(arr));

        // the above method can be done in a single line
        String[] strArr = new String[]{"apple", "orange", "grape"};
        System.out.println(Arrays.toString(strArr));

        char letters[] = {'l', 'e', 't', 't', 'e', 'r', 's'};
        System.out.println(Arrays.toString(letters));

     }

     public static int[] printArrayWithIntegerMinValues(int size){
        int arr[] = null;
        arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;     //initialising the array with a java Integer constant
        }

       return arr;
     }

     public static void printArrayNums(){

        int[] numList = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i <= numList.length - 1; i++){
            System.out.println(numList[i]);
        }

     }
    
    public static void main(String[] args) {
        
        // printArrayNums();
        // createNewArray();
        int arr[] = printArrayWithIntegerMinValues(5);
        System.out.println(Arrays.toString(arr));

    }

}