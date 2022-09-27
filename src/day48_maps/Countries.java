package day48_maps;

import java.util.*;

public class Countries {

    public static void main(String[] args) {

        //key is country -->SAtring
        //value is cities --> List<String>
        Map<String , List<String>> countries = new HashMap<>();
        countries.put("United States", new ArrayList<>(Arrays.asList("Chicago", "Dallas", "Irvine",
                "San Diego", "New York", "Philadelphia", "Madison")));
        countries.get("United States").add("Seattle");
        //            get from map      get from Arraylist
        countries.get("United States").get(0); // <--- returns Chicago, city on first index

        countries.put("Europe", new ArrayList<>(Arrays.asList("London", "Paris" , "Rome","Marcel" ,"Berlin", "Madrid")));

        countries.put("Uzbekistan", new ArrayList<>(Arrays.asList("Tashkent", "Samarqand", "Bukhara",
                "Fergana", "Urgench", "Khiva")));
        countries.put("Kazahstan", new ArrayList<>(Arrays.asList("Astana", "Almaty", "Aktope", "Kokshetau")));

        System.out.println(countries);
        Scanner input = new Scanner(System.in);
        System.out.println("What country are you going to tour? --> "+ countries.keySet());

        String country = input.next();

        for ( String eachCity: countries.get(country)){ // iterating through each city of the scpecific country
            System.out.println("Touring : "+ eachCity);
        }

        for (Map.Entry<String, List<String>> eachEntry : countries.entrySet()){ //iterating through each entry

            for ( String eachCity: eachEntry.getValue()){ //iterating through each city
                if (eachCity.startsWith("A")  || eachCity.endsWith("a")){
                    System.out.println(eachCity);
                }
            }

        }
    }
}
