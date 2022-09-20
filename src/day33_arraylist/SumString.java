package day33_arraylist;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.ArrayList;
import java.util.Arrays;

public class SumString {

    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<>(Arrays.asList("123", "34", "513", "4913", "1248"));
        System.out.println(nums);
        System.out.println(sumDigets(nums));
    }


    //method that will accept the Arraylist of string with numbers
    //store into another arraylist
    // add the numbers from each string ---> "123" --> 6, "34"--> 7
    public static ArrayList<Integer> sumDigets(ArrayList<String> list){

        ArrayList<Integer> nums = new ArrayList<>();

        for (String each: list){

            int sum = 0; // container for every number to store

            for (String eachDigit : each.split("")) {// splits the each into a String array where each digit is separate element
                //each digit is a separate element
                sum += Integer.parseInt(eachDigit);

            }
            nums.add(sum);
        }
        return nums;

    }

}
