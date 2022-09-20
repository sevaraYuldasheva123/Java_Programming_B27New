package day16_strings;

public class SubstringExamples {

    public static void main(String[] args) {

        String s =  "infinity";
        //           01234567
        System.out.println(s.substring(3)); // --> returns inity

        //range
        System.out.println(s.substring(1,6)); // -->nfini

    }
}
