package day22_array;

import java.util.Arrays;

public class Cities {

    public static void main(String[] args) {

        String city1 = "Chicago";
        String city2 = "West Palm";
        String city3 = "Miami";
        String city4 = "New York";
        String city5 = "Toronto";
        String city6 = "Houston";

        String[] cities = {"Chicago", "West Palm", "Miami", "New York", "Toronto", "Houston"};

        //access each city one at a time
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        System.out.println(cities[5]);

        System.out.println(cities); // will not be able to print directly, prints hashcode
        Arrays.toString(cities); // will return the array object as string
        System.out.println(Arrays.toString(cities));

    }
}
