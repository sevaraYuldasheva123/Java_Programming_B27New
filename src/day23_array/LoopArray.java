package day23_array;

import java.util.Arrays;

public class LoopArray {

    public static void main(String[] args) {

        int[] nums = {4,213,6};

        for (int i = 0; i < nums.length;i ++){

            System.out.println((nums[i]));
        }

        //create our own printing format

        String arrayAsString = "Array ~" ;

        for (int i = 0; i < nums.length; i ++){

            arrayAsString += nums[i] + " | ";

        }
        arrayAsString += " ~ ";

        System.out.println(arrayAsString);
        System.out.println();

        // for each loop
        for (int eachNumber : nums){ //read all the numbers from the array beginning to end
            System.out.println(eachNumber);

        }


    }
}
