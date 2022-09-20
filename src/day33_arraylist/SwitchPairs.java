package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchPairs {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("cat" , "in", "the", "hat", "hello", "world"));
        System.out.println(list);
        System.out.println(switchPairs(list));
    }

    public  static ArrayList<String> switchPairs(ArrayList<String> list){

        for (int i = 0; i < list.size(); i+=2){
            String temp = list.get(i);
            list.set(i, list.get(i+1));
            list.set(i+1, temp);
        }
        return list;
    }

}
