package day51_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod2 {

    public static void main(String[] args) {

        //boxed() --> convirts the data from int to Integer = result is Stream<Integer>
        int[] arr = {3,4,1,5,15,4};
        Arrays.stream(arr).boxed().collect(Collectors.toList());

        List<Integer> list2 = new ArrayList<>(Arrays.asList(3,5,1,5,5,12,5,2));
        int[] arr2 = list2.stream().mapToInt( n -> n ).toArray();

        /*
        list2.stream() -> converts List to a Stream <Integer>
        .mapToInt(n -> n) --> converts each number to an int type
         */
        System.out.println("======================================");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(3,5,1,5,5,12,5,2));
        System.out.println("list3.stream().map(n -> n * 2).collect(Collectors.toList()) = " + list3.stream().map(n -> n * 2).collect(Collectors.toList()));

        List<String> list4 = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednsday", "Thursday", "Friday","Saturday","Sunday"));
        System.out.println(list4.stream().map(day -> day.substring(0,3).toUpperCase()).collect(Collectors.toList()));

        System.out.println("======================================");

        //filter() --> filters the result , works with predicate
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evens = list5.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        List<Integer> odds = list5.stream().filter(p -> p % 2 != 0).collect(Collectors.toList());

        System.out.println("Evens: "+evens);
        System.out.println("Odds: "+odds);

        //give back all even numbers and then count them
        System.out.println(list5.stream().filter( p -> p % 2 == 0 ).count());

        //check all  "java" occurrences in the list"
        List<String> list6 = new ArrayList<>(Arrays.asList("java", "soft skills", "javascript",
                "JAVA", "JAVAscript", "selenium", "restassured", "cypress"));
        System.out.println(list6.stream().filter(p -> {

            p = p.toLowerCase();
            return  p.contains("java");

        }).collect(Collectors.toList()));

        //check how many times "java occurred in the list"
        System.out.println(list6.stream().filter(p -> p.toLowerCase().contains("java")).count());


    }
}
