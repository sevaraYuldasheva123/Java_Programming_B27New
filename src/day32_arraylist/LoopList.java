package day32_arraylist;

import java.util.ArrayList;

public class LoopList {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(8);
        nums.add(7);
        nums.add(3);
        nums.add(4);

        for (int i = 0; i < nums.size();i++){
            System.out.print(nums.get(i)+ " ");
        }

        System.out.println();

        for (Integer each : nums){
            System.out.print(each + " ");
        }

    }
}
