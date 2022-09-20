package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "tree", "monday"));
        System.out.println(hidePassword(list));
    }

    public static ArrayList<String> hidePassword(ArrayList<String> list){

        ArrayList<String> hidden = new ArrayList<>();
        for (String each : list){

            hidden.add(numberOfStars(each.length()));
        }

        return hidden;
    }

    public static String numberOfStars(int length){

        String stars = "";
        for (int i = 0; i < length;i++){
            stars += "*";
        }
        return stars;
    }
}
