package day31_arraylist;

import java.util.ArrayList;

public class BooleanMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(41);
        list.add(5512);
        list.add(413);
        System.out.println(list);
        System.out.println(list.isEmpty()); // will return false since our list is not empty
        System.out.println(list.contains(41)); // will return true since our list has 41

        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(41);
        list.add(5512);
        list.add(413);

        System.out.println("Equals Method: "+ list.equals(list2));

        ArrayList<Integer> list3 = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(41);
        list.add(5512);
        list.add(413);

        System.out.println("Equals Method: "+ list2.equals(list3));

    }
}
