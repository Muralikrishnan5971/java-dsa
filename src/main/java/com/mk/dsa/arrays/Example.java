package com.mk.dsa.arrays;

public class Example{

    public static void main(String[] args) {
        
        // Example.totalTimeToPrintTenThousandNums();
        Example.findGivenNumber(9999996);

        /*
         * The above to methods take different times to return the ans everytime.
         * We are running the same code in the same machine, still we are getting
         * different execution time, each time we run it.
         * 
         * But the try's it take to get the ans is same only.
         * 
         * 
         */
    }

    public static void totalTimeToPrintTenThousandNums(){

        long startTime = System.currentTimeMillis();

        for (int i = 1; i < 10000; i++) {
            System.out.println(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total time took to print 10000 numbers :: " + (endTime - startTime) + "ms");

    }

    public static void findGivenNumber(int x){

        long startTime = System.currentTimeMillis();

        int n = 10000000;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            count++;
            if (x == i){
                
                System.out.println("found "+x+" in "+count+" try.");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total time took to find "+x+" in "+n+" numbers :: " + (endTime - startTime) + "ms");


    }

}