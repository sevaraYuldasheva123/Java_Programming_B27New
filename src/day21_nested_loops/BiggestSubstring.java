package day21_nested_loops;

public class BiggestSubstring {

    public static void main(String[] args) {


        //biggest substring of matching chars --> aaaabbbbccccccccdddd ---> cccccccc is the longest in the string

        String str = "aaabbbcccccddddeeeeee";
        String longest = "";
        String each = "";

        for(int i = 0; i < str.length()-1; i++){

            each += str.charAt(i); // adds the characters at index i to the --> each

            if(str.charAt(i) != str.charAt(i+1)){// this if statement checks if the current character is not equal to the next character

                if( each.length() > longest.length()){
                    longest = each;
                }

                each = ""; // resetting for the next part
            }

            if(i == str.length()-2 && str.charAt(i)== str.charAt(i+1)){
                each += str.charAt(i+1);
                if(each.length() > longest.length()){
                    longest = each;
                }
                each ="";
            }

        }

        System.out.println(longest);
    }
}
