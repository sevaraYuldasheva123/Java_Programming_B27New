package day47_collections;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {

        //key is Integer , Value is String
        Map<Integer, String> map1 = new HashMap<>();// random order
        map1.put(4, "four");
        map1.put(1, "one");
        map1.put(7, "seven");
        map1.put(10, "ten");
        map1.put(-2, "negative 2");
        map1.put(5, "five");

        System.out.println(map1);

        Map<Integer, String> map2 = new LinkedHashMap<>();// insertion order is kept
        map2.put(4, "four");
        map2.put(1, "one");
        map2.put(7, "seven");
        map2.put(10, "ten");
        map2.put(-2, "negative 2");
        map2.put(5, "five");

        System.out.println(map2);

        Map<Integer, String> map3 = new TreeMap<>(); // sorted, does not accept null
        map3.put(4, "four");
        map3.put(1, "one");
        map3.put(7, "seven");
        map3.put(10, "ten");
        map3.put(-2, "negative 2");
        map3.put(5, "five");

        System.out.println(map3);

        Map<Integer, String> map4 = new Hashtable<>(); // random order, no null
        map4.put(4, "four");
        map4.put(1, "one");
        map4.put(7, "seven");
        map4.put(10, "ten");
        map4.put(-2, "negative 2");
        map4.put(5, "five");
        System.out.println(map4);
    }
}
