package day47_collections;

import java.util.HashMap;
import java.util.Map;

public class GroupOfPeople {

    public static void main(String[] args) {
                // value is a custom object type
        Map<Integer, Person> residents = new HashMap<>();
        //Apartment --> Apartment number is the Key, Resident name is Value
        residents.put(201, new Person("James", 40));
        residents.put(202, new Person("Anna", 20));
        residents.put(203, new Person("Faith", 35));
        residents.put(204, new Person("James", 40));

        System.out.println(residents);
        System.out.println(residents.get(202));


    }
}
