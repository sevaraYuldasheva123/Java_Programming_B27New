package day32_arraylist;

import my_utils.EasyData;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Friday", "java", "Summer", "Reading", "Coding", "java", "Coding", "summer", "SUMMER" ));

        System.out.println(searchInList(list, "summer"));

        //testing easyData
        ArrayList<String> weekDays = EasyData.getDaysOfWeek();
        System.out.println(weekDays);

        ArrayList<Integer> nums = EasyData.getRandomNumbers(10);
        System.out.println(nums);

    }
    public static int searchInList(ArrayList<String>list, String targetWord){

        int counter = 0;

        for (String eachWord: list){

            if (eachWord.equalsIgnoreCase(targetWord)){
                counter++;

            }
        }

        return counter;



    }
}
