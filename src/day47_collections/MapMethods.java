package day47_collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        Map<Character, Integer> gradeScale = new HashMap<>();
        //adding to a MAP --> put()
        gradeScale.put('A', 90);
        gradeScale.put('B', 80);
        gradeScale.put('C', 70);
        gradeScale.put('D', 60);
        gradeScale.put('Z', 1000);
        gradeScale.put('Z', 3000);

        //read from map --> get(key)
        System.out.println("gradeScale.get('C') = " + gradeScale.get('C'));

        //remove from map --> remove(key)
        gradeScale.remove('Z');


        //check if map contains smth --> containKeys(key) / containsValue(value)
        System.out.println(gradeScale.containsKey('C'));
        System.out.println(gradeScale.containsValue(90));

        System.out.println(gradeScale);





    }
}
