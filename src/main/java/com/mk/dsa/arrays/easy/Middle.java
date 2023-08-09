package com.mk.dsa.arrays.easy;

import java.util.Arrays;

public class Middle {
    /*
     * Write a function called middle that takes an array and 
     * returns a new array that contains all but the first and last elements.
     * 
     * myArray = [1, 2, 3, 4]
     * middle(myArray)  = [2,3]
     */

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(middle(arr)));
    }

    public static int[] middle(int[] array) {
        if(array.length <= 2){
            System.out.println("Please enter array with more than two elements");
        }
        
        int[] middleArray = new int[array.length - 2];
        for(int i = 1; i < array.length - 1; i++){
            middleArray[i - 1] = array[i];
        }
        return middleArray;
    }
}
