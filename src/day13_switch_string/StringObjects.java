package day13_switch_string;

import day03_variables.ShoppingReciept;

public class StringObjects {

    public static void main(String[] args) {

        String s = "first"; //string literal, stored in string pool

        String s2 = new String("second"); //object, stored directly in the heap

        System.out.println(s == s2); // compares 2 objects

        String s3 = new String("first");
        System.out.println(s == s3); // false

        String s4 = "second";

        System.out.println(s == s4); // false

        String s5 = "first";

        System.out.println(s == s5); //both string literal both stored in same string pool both have same value -- > returns true
    }
}
