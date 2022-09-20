package day19_loops;

public class CountLetter {

    public static void main(String[] args) {

        //frequency
        //word java --> how many a and etc

        String str = "sevara";
        int count = 0;

        for (int i = 0; i < str.length(); i++){

           if(str.charAt(i) == 'a'){
               count++;
           }

            }

        System.out.println("Occurance of character a in a word: "+ count);
    }
}
