package day48_maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Season {

    public static void main(String[] args) {

        // avg temp for each season

        Map<String, Double> temperatures = new HashMap<>();
        temperatures.put("summer", 85.0);
        temperatures.put("fall", 65.2);
        temperatures.put("winter", 30.5);
        temperatures.put("spring", 68.2);

        System.out.println(temperatures);

        System.out.println("Average temperature for winter: "+ temperatures.get("winter"));

        // are there any duplicate values
        System.out.println( temperatures.values());
        int before = temperatures.values().size(); // returns 4
        int after = new HashSet<>(temperatures.values()).size(); // set does not accept duplicates

        System.out.println(before);
        System.out.println(after);

        //find average temperature for each season




    }
    public static double avgTemp(Map<String, Double> map){
        double average = 0;

        for (double eachTemp: map.values()){
            average += eachTemp;
        }
        return average / map.size();

    }
}
