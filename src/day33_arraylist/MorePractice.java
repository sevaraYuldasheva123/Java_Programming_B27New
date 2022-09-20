package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class MorePractice {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Mutasem", "Baz", "Anam", "Tina", "Manziha",
                "Busra", "Reem", "Farzona", "Marjan"));

        ArrayList<String> byLength = new ArrayList<>(names);
        byLength.removeIf(name -> name.length() > 5);
        System.out.println(byLength);

        System.out.println();

        ArrayList<String> byFirstLetter = new ArrayList<>(names);
        byFirstLetter.removeIf(p -> p.startsWith("M") || p.startsWith("B") );
        System.out.println(byFirstLetter);

        System.out.println();
        ArrayList<String> byLastLetter = new ArrayList<>(names);
        byLastLetter.removeIf(str -> !str.endsWith("a"));
        System.out.println(byLastLetter);

        System.out.println();

        names.forEach(each -> System.out.println(each)); // print every element from the list


    }
}