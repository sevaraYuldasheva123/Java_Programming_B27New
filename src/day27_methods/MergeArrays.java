package day27_methods;

import java.util.Arrays;

public class MergeArrays {
    /*
    Given 2d array merge the elements into 1 d array

    {1,2,3,4}, {5,6,7,8} ---> {1,2,3,4,5,6,7,8}
     */

    public static void main(String[] args) {

        int [][] nums = { {10, 20, 30} , {5, 10, 15} , {1, 2, 3, 4}};

        int size = 0;
        // this array is created to dinamicly find out the size of nums
        for(int [] eachArray : nums){
            size+=eachArray.length;
        }

        int [] merged = new int[size];
        int indexToStore = 0; // we need index to use in for each loop

        for(int[] eachArray : nums){

            for(int eachNum : eachArray){

                merged[indexToStore] = eachNum;
                indexToStore++;
            }
        }
        System.out.println(Arrays.toString(merged));

    }
}
