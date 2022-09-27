package day48_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {

    public static void main(String[] args) {

        Map<String, String>  person1 = new HashMap<>();
        person1.put("FIRST_NAME", "James");
        person1.put("LAST_NAME", "Bond");
        person1.put("AGE", "40");
        person1.put("ADDRESS", "131 PARK AVENUE DRIVE, LONDON");

        Map<String, String>  person2 = new HashMap<>();
        person2.put("FIRST_NAME", "Anna");
        person2.put("LAST_NAME", "Jones");
        person2.put("AGE", "30");
        person2.put("ADDRESS", "2312 TUCKER AVE");

        System.out.println(person1.get("FIRST_NAME"));

        List<Map<String, String>> allPeople = new ArrayList<>();
        allPeople.add(person1);
        allPeople.add(person2);
        System.out.println(allPeople);

        System.out.println(allPeople.get(0));
        System.out.println(allPeople.get(0).get("FIRST_NAME"));

        //age should not be empty
        for (Map<String, String> eachPerson : allPeople){
            if (eachPerson.get("AGE") == null){
                System.out.println("FAIL");
            }
        }



    }
}
