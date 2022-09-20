package day24_array;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {

        String str = "Today is Friday. Have a good weenend!";

        //reverse the sentence
        String[] words = str.split(" ");
        String reverse = "";

        for (int i = words.length-1; i >= 0; i--){

            reverse += words[i]+" ";

        }
        System.out.println(reverse.trim());
    }
}
