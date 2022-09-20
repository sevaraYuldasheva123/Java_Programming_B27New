package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatingWithValues {

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 1};

        Arrays.asList(arr); // converting array to arraylist

        Integer[] arr2 = {3, 4, 4, 6};
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(arr2));

        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(arr2));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,2,1));

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Sevara", "Kate", "Julia"));


    }
}
