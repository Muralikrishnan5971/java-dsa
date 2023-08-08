package com.mk.dsa.arrays;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {

        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 10);
        sda.insert(1, 20);
        sda.insert(6, 60);
        sda.insert(0, 100);
        sda.insert(2, 30);

        // // accessing array elements
        // int firstElement = sda.arr[0];
        // System.out.println(firstElement);

        // sda.traverseArray();

        // finding a element in the array
        sda.searchArray(20);
        sda.deleteByIndex(2);
        System.out.println(sda.arr[2]);

        System.out.println("*************************************************");

        TwoDimensionArray tda = new TwoDimensionArray(3, 3);
        tda.insertValueInArray(0, 0, 10);
        tda.insertValueInArray(0, 1, 20);
        tda.insertValueInArray(0, 2, 30);
        System.out.println(Arrays.deepToString(tda.arr));

        tda.getValueInArray(0, 2);

        tda.traverse2DArray();

        tda.searchGivenValue(30);

    }
}
