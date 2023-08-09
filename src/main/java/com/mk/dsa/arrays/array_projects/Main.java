package com.mk.dsa.arrays.array_projects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // calcAverageTemperatureWithoutArray();
        calcAverageTemperatureWithArray();
    }

    public static void calcAverageTemperatureWithArray(){

        Scanner console = new Scanner(System.in);
        System.out.print("How many day's temperature ? ");
        int numberOfDays = console.nextInt();

        int[] temps = new int[numberOfDays];
        int sumOfTemperature = 0;

        // store the user input (temperature values) to the array
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Please enter Day "+ (i + 1) + " temperature: ");
            temps[i]= console.nextInt();

            // calculation total sum of temperature
            sumOfTemperature += temps[i];

        }
        double averageTemperature = sumOfTemperature / numberOfDays;

        // count days above average
        int count = 0;
        for (int i = 0; i < temps.length; i++) {
            if(temps[i] > averageTemperature){
                count++;
            }
        }
        System.out.println();
        System.out.println("Average Temperature is: " + averageTemperature);
        System.out.println("Number of days with temperature above Avg temperature: " + count);
        console.close();
    }

    public static void calcAverageTemperatureWithoutArray(){

        Scanner console = new Scanner(System.in);
        System.out.print("How many day's temperature ? ");
        int numberOfDays = console.nextInt();
        int sumOfTemperature = 0;

        for (int i = 1; i <= numberOfDays; i++) {
            System.out.print("Please enter Day "+ i + " temperature: ");
            sumOfTemperature += console.nextInt();
        }

        double averageTemperature = sumOfTemperature / numberOfDays;
        System.out.println();
        System.out.println("Average Temperature is: " + averageTemperature);

        console.close();

        /*
         * Everything works here smoothly, And we have not used array data structure.
         * But the question over here is, how do you count how many days were above
         * average temperature ? 
         * 
         * We could try to incorporate it inside this loop over here, but it won't work.
         * The problem is you cannot figure out the average untill you have gone through 
         * all of the date. This means that we need to go through data again to figure out 
         * how many days were of average temperature. And one more time throughthe loop
         * to find out which temperature is above the average temperature. Since we are using 
         * Scanner class, which doest have any option to see the data second time.
         * 
         * We might need to prompt the user a second time for the data, but its not good practise.
         * 
         * here only Data structtures comes into the picture. The above problem can be solved
         * using Arrays!
         * 
         * 
         */
    }
}
