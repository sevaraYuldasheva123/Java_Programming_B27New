package day48_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        // apple
        /*
        a-1
        p-2
        l-1
        e-1
         */

        String str = "sevara";
        //
        Map<Character, Integer> counter = new LinkedHashMap<>(); // order is maintained
        for (int i = 0; i < str.length(); i++){

            char key = str.charAt(i);
            if (counter.containsKey(key)){
                //count
                counter.put(key, counter.get(key) + 1); // get method will read the current counter value
                // and then adds 1 to the value, so the new value after adding 1 get stored as the new value for the same key
            }else {
                //this is the first time seeing the character , it is not in the map yet
                counter.put(key, 1);
            }
        }
        System.out.println(counter);
    }
}
