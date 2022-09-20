package day25_array;

import java.util.Arrays;

public class SecondMax {

    public static void main(String[] args) {

        //Given an array of numbers find and print the second biggest number
        // [4, 3, 1, 4, 5, 2, 4, 8, 4, 8]  ----> 5

        int[] nums = {4, 3, 1, 4, 5, 2, 4, 8, 4, 8};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("Max number is: "+nums[nums.length-1]);
        //System.out.println("Second max number is: ");

        int max = nums[nums.length-1];
        for (int i = nums.length-1; i >= 0; i--){
            if(nums[i] != max){
                System.out.println("Second Max: "+ nums[i]);
                break;// break loop when find the new num which is not same as max
            }

        }


    }


}
