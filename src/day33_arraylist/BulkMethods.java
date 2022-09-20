package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);

        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(6, 1, 5, 1224));
        nums.addAll(other);
        System.out.println(nums);

        nums.addAll(0, Arrays.asList(4, 1, 5, 125));
        System.out.println(nums);
        nums.removeAll(Arrays.asList(1));
        System.out.println(nums);
    }


}
