package day45_polymorphism.learn_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {

    public static void main(String[] args) {

        //accepts  null, order is random
        Set<String> set1 = new HashSet<>();
        set1.add(null); // accepts null
        set1.add("hello world");
        set1.add("5.0");
        set1.add("#zebra");
        set1.add("hello world");
        set1.add("Java");
        System.out.println(set1);

        //does not accept duplicate, maintains insertion order
        Set<String> set2 = new LinkedHashSet<>();
        set2.add(null); // accepts null
        set2.add("hello world");
        set2.add("5.0");
        set2.add("#zebra");
        set2.add("hello world");
        set2.add("Java");
        System.out.println(set2);

        //does not accept duplicate, does not accept null, maintains ascending order
        Set<String> set3 = new TreeSet<>();
        set3.add("hello world");
        set3.add("5.0");
        set3.add("#zebra");
        set3.add("hello world");
        set3.add("Java");
        System.out.println(set3);


    }
}
