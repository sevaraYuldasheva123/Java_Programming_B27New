package day26_multi_array;

import java.util.Arrays;

public class Avarage {

    public static void main(String[] args) {

        //see avarage of each array
        // see the total of all numbers in the array

        //average = sum of numbers / number of elements

        int totalSum = 0;
        int totalElements = 0;

        int [][] nums = {
                {3, 5, 1, 2},
                {2, 1, 5, 10, 8},
                {3, 1, 5, 12}

        };

        for(int[] eachInner : nums){ // looping through 2D array nums

            int sum = 0; // storing inside the loop so it can reset each time

            for (int eachNumber : eachInner){
                sum+=eachNumber;
            }
            System.out.println(Arrays.toString(eachInner));
            System.out.println("Average: "+(double)sum / eachInner.length);

            totalSum += sum;
            totalElements += eachInner.length;

        }
        System.out.println();
        System.out.println("Total average of nums: "+ (double)totalSum / totalElements);
    }
}
