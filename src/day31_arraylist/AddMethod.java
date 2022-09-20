package day31_arraylist;

import java.util.ArrayList;

public class AddMethod {

    public static void main(String[] args) {

        ArrayList <Character> letters = new ArrayList<>(); // empty array list is created
        System.out.println(letters.size()); // <---- 0 is the size for now
        letters.add('j'); //add method adds value to the arrayList
        letters.add('a');
        letters.add('v');
        letters.add('a');
        System.out.println(letters.size()); // <---- 4 is the size after adding the values

        System.out.println(letters.get(0)); // will return a char on index 0
        letters.add(3, 'a');
        System.out.println(letters);


    }
}
