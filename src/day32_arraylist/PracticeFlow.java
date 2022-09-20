package day32_arraylist;

import java.util.ArrayList;

public class PracticeFlow {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Hat");
        System.out.println(words);
        words.add("Shoes");
        System.out.println(words);
        words.add(1, "Jacket");
        System.out.println(words);
        words.add(0, "Towel");
        System.out.println(words);
        words.add(1, "Car");
        System.out.println(words);

        System.out.println();
        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Iron Man");
        avengers.add("Spider Man");
        avengers.add("Thor");
        avengers.add("Capitan America");
        avengers.add("Hawkeye");
        System.out.println(avengers);
        System.out.println();

        for (String  each : avengers){

            if (each.contains(" ")){
                int space = each.indexOf(" ")+1;
                System.out.println(each.substring(0,1) +each.substring(space, space+1));
            }else {
                System.out.println(each.charAt(0));
            }

        }



        int indexOfThor = avengers.indexOf("Thor");

        System.out.println(avengers);
    }
}
