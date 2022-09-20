package day29_methods;

import my_utils.StringUtil;

public class DuplicateCharacters {

    public static void main(String[] args) {

        System.out.println(getDuplicateCharacters("aaaaabcdeee"));
    }

    public static String getDuplicateCharacters(String str){

        String duplicate = "";
        for(int i = 0; i < str.length(); i++){

            int frequency = StringUtil.frequencyOfChar(str, str.charAt(i));

            if(frequency > 1){
                duplicate += str.charAt(i);
            }
        }
        return duplicate;



    }
}
