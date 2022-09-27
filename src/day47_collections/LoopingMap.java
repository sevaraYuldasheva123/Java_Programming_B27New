package day47_collections;

import java.util.HashMap;
import java.util.Map;

public class LoopingMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("December", 12);
        map.put("April", 4);

        // for ( : map)  we can not use for each loop only with map
        for (String eachKey: map.keySet()){ // iterates through set of keys
            System.out.println("each key: "+eachKey);
            System.out.println("value for each key: "+ map.get(eachKey));
        }

        //
        for (Integer eachValue: map.values()){// iterates through all  the values
            System.out.println(eachValue);
        }

        //
        for (Map.Entry<String, Integer> eachEntry: map.entrySet()){ // iterates through all  the entries
            System.out.println(eachEntry);
        }
    }
}
