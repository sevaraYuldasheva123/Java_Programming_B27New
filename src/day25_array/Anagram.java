package day25_array;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        //listen - silent --> same letters
        String word1 = "listen";
        String word2 = "silent";

        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);


        if(Arrays.equals(first, second)){
            System.out.println("Word is anagram");
        }else {
            System.out.println("Word is not anagram");
        }

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
    }


}
