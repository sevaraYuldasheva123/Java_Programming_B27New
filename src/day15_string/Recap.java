package day15_string;

public class Recap {

    public static void main(String[] args) {

        String first = "Testing";
        first = first.toUpperCase();

        String second = "SOFT SKILLS";
        second = second.toLowerCase();

        System.out.println(first);
        System.out.println(second);

        String third = "    hello world   ";
        System.out.println(third.length());
        third = third.trim();
        System.out.println(third.length());
    }
}
