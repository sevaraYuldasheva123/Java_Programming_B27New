package day50_functional_interfaces;

import day47_collections.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class OtherFunctionalInterface {

    public static void main(String[] args) {
                            //               arr name of the array, num --> number i a, looking for
        BiPredicate<int[], Integer> contains = (arr, num) -> {
            for (int each: arr){
                if (each == num){
                    return true;
                }
            }
            return false;
        };

        int[] arr = {4,6,12,5,12,5,5,6};
        System.out.println("contains.test(arr, 12) = " + contains.test(arr, 12));
        System.out.println("contains.test(arr, 8) = " + contains.test(arr, 8));

        BiConsumer<Integer, Integer> multiplicationTable = (num, max) -> {

            for (int i = 1; i <= max; i++){
                System.out.println(num + " x " + i + " = "+(num * i));
            }
        };
        multiplicationTable.accept(5, 15);

        Map<Integer, Person> classroom = new HashMap<>();
        classroom.put(1, new Person("James", 35));
        classroom.put(2, new Person("Anna", 30));
        classroom.put(3, new Person("Jane", 32));

        System.out.println(classroom);

        classroom.forEach((key, value) -> System.out.println("Key: "+ key+ " Value: "+value));




    }
}
