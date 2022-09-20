package day31_arraylist;

import java.util.ArrayList;

public class RemovingMethod {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("today");
        words.add("is");
        words.add("sunny");
        words.add("java");

        System.out.println(words);
        words.remove(2); // can remove by index
        System.out.println(words);
        words.remove("today"); // can remove by object
        System.out.println(words.remove("is"));
        System.out.println(words);


        words.clear(); // empties the whole arraylist
        System.out.println(words);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(0);
        nums.add(2);
        nums.add(4);

        nums.remove(0); // <--- will remove the index 0
        System.out.println(nums);

        Integer a = 0;
        nums.remove(a);
        System.out.println(nums);

        nums.remove((Integer) 2); // will remove actual number 2, the value
        System.out.println(nums);

    }
}
