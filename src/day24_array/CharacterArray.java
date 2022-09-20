package day24_array;

import java.util.Arrays;

public class CharacterArray {

    public static void main(String[] args) {

        String s = "hello world";
        char[] letters = s.toCharArray();
        System.out.println(Arrays.toString(letters));

        for (char eachLetter: s.toCharArray()){
            System.out.print(eachLetter);
        }

        System.out.println();

        String str = "monday,tuesday, wednsday,thursday,friday,saturday,sunday";
        System.out.println(Arrays.toString(str.split(",")));

        System.out.println();

        String str2 = "Jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sep-Oct-Nov-Dec";
        String[] month = str2.split("-");

        for (String eachMonth: month){
            System.out.print(eachMonth);
        }

        System.out.println();

        String str3 = "Mississippi";
        System.out.println(Arrays.toString(str3.split("si")));
        System.out.println();

        String str4 = "java";
        System.out.println(Arrays.toString(str4.toCharArray()));
        System.out.println(Arrays.toString(str4.split("")));
    }
}
