package com.mk.dsa.arrays;
import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        // declare
        int[][] arr;
        // instantiate
        arr = new int[2][2];
        // initialize
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;

        /*  using Arrays class to print the two dimensional array.
        Arrays.toString() method will print the single dimensional arrays.
        whereas, for 2 d arrays, we need to use Arrays.deepToString()

        */
        System.out.println(Arrays.deepToString(arr));

        // clubbing all the above steps to single steps 
        String str[][] = {{"apple", "pear"}, {"grape", "orange"}};
       
    }
}
