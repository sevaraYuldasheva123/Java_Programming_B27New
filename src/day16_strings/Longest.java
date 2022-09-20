package day16_strings;

import java.util.Scanner;

public class Longest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first word");
        String word1 = input.nextLine();

        System.out.println("Please enter second word");
        String word2 = input.nextLine();

        System.out.println("Please enter your third word");
        String word3 = input.nextLine();

        int word1Length = word1.length();
        int word2Length = word2.length();
        int word3Length = word3.length();

        if(word1.contains("a") && word1Length > word2Length && word1Length > word3Length){
            System.out.println("word1 is the longest word with a");
        }else if(word2.contains("a") && word2Length > word1Length && word2Length > word3Length){
            System.out.println("word2 is the longest word with a");
        }else if(word3.contains("a") && word3Length > word2Length && word3Length > word1Length){
            System.out.println("word3 is longest word with a");
        }else{
            System.out.println("There is no longest word in here");
        }



    }
}
