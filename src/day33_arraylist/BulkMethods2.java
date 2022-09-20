package day33_arraylist;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4,1,1,2,3,4,5,1,4,14, 4, 5, 123));

        System.out.println("Contains 4: "+nums.contains(4));
        System.out.println("Contains 4 and 5: "+ (nums.contains(4)&& nums.contains(5)));
        System.out.println("Contains all --> 4, 3, 5, 1: "+ nums.containsAll(Arrays.asList(4,3,5,1)));
        nums.retainAll(Arrays.asList(14, 123));
        System.out.println(nums);

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'e','d','z'));
        letters.retainAll(Arrays.asList('a', 'z'));
        System.out.println(letters);

        System.out.println();
        String s = "implementation";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        list.retainAll(Arrays.asList("a","e", "i", "o", "u") );
        System.out.println(list);
    }
}
