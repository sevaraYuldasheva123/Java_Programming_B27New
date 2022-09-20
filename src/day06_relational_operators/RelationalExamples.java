package day06_relational_operators;

public class RelationalExamples {

    public static void main(String[] args) {

        System.out.println(3 > 2);// returns boolean type -->true
        System.out.println(5 > 10); // returns false

        System.out.println();

        int a = 10;
        int b = 20;
        System.out.println(a < b); // true 10 is less than 20

        // == comparing values

        System.out.println(10 == 10); // returns true, values are equal
        boolean isEqual = 11 == 5; //returns false
        System.out.println(isEqual);

        System.out.println(4 != 20); // not equal ---> returns true
        System.out.println(20 != 20); // returns false

    }
}
