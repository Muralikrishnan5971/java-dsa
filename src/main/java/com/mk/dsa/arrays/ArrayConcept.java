package com.mk.dsa.arrays;

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
    
    public static void main(String[] args) {
        
        int[] numList = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i <= numList.length - 1; i++){

            System.out.println(numList[i]);
        }


        /* Creating an array involves three steps

    1. Declaring
    2. Instantiating
    3. Initialization

     */

        int[] arr;          // Declaring
        arr = new int[6];   // Instantiating
        arr[0] = 10;        // Initialisation
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;

    }

}