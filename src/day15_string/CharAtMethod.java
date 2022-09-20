package day15_string;

public class CharAtMethod {

    public static void main(String[] args) {

        //          0123  indexes
        String s = "java";

        System.out.println(s.charAt(0)); // j
        System.out.println(s.charAt(1)); // a
        System.out.println(s.charAt(2)); // v
        System.out.println(s.charAt(3)); // a

        //reverse a string --> hardcoded
        System.out.print(s.charAt(3)); // a
        System.out.print(s.charAt(2)); // v
        System.out.print(s.charAt(1)); // a
        System.out.print(s.charAt(0)); // j

        System.out.println();


    }
}
