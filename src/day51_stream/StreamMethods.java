package day51_stream;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

    public static void main(String[] args) {

        //create a stream
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3,4,6,12,5));
        list1.stream(); // created the stream
        System.out.println(list1.stream());

        int[] arr1 = {3, 5, 6, 12, 5};
        Arrays.stream(arr1); //made stream from array

        // distinct --> method from stream , removes duplicates
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,1,2,1,2,3,4,5,6,6,7,6,5,4,2,4,1,5,7,4,2));

        //we cannot print stream just as it is --> we have to convert it -->.collect(Collectors.toList())
        System.out.println(list2.stream().distinct().collect(Collectors.toList()));

        int[] arr2 = {1,1,1,2,1,2,3,4,5,6,6,7,6,5,4,2,4,1,5,7,4,2};
        arr2 = Arrays.stream(arr2).distinct().toArray();

        System.out.println(Arrays.toString(arr2));

        //skip ---> slip certain amount data
        List<String> list3 = new ArrayList<>(Arrays.asList("summer", "bike", "fall",
                "raining", "pond", "lake", "fishing", "sun"));

        //// removed first 3 entered data
        System.out.println(list3.stream().skip(3).collect(Collectors.toList()));

        //limit() ---> keep first 5
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list4.stream().limit(5).collect(Collectors.toList()));

        //using both, limit and skip --> keep all till 6 but also skip first 2
        System.out.println(list4.stream().limit(6).skip(2).collect(Collectors.toList()));

        //count: counts how many elements/data are in the stream
        //using with the distinct first remove duplicates and then count
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,1,1,2,1,2,3,4,5,6,6,7,6,5,4,2,4,1,5,7,4,2));
        System.out.println(list5.stream().distinct().count());
        String s = "aaaaabbbbbbcccccddddeeeeeeffff";
        // after removing duplicates, count how many unique characters there are
        System.out.println(Arrays.stream(s.split("")).distinct().count());
    }
}
