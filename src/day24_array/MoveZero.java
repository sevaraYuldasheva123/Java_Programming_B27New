package day24_array;

import java.util.Arrays;

public class MoveZero {

    public static void main(String[] args) {

        int[] nums = {10, 0, 5, 0, 1, 0};
        int[] fixedToRead = new int[nums.length];
        int indexToRead = 0; // to read every element from beginning to end <--- like i veriable
        int indexToStore = 0; // store values into the fixed array

        while (indexToRead < nums.length){

            if(nums[indexToRead] != 0){
                fixedToRead[indexToStore] = nums[indexToRead];
                indexToStore++;
            }

            indexToRead++;
        }
        System.out.println(Arrays.toString(fixedToRead));
    }
}
