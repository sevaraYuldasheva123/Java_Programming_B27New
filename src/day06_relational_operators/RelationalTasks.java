package day06_relational_operators;

public class RelationalTasks {

    public static void main(String[] args) {

        /*
        declare a speed variable
        speedLimit = 50
        find out if you are speedidng
         */

        int speed = 45;
        int speedLimit = 50;

        boolean withinLimit = speed<=speedLimit;
        System.out.println(withinLimit);

        System.out.println();

        /*
        declare a number variable
        find out if the number is positive , negative or zero
         */

        int num1 = -4;
        boolean isPositive = num1>0;
        boolean isNegative = num1<0;
        boolean isZero = num1 == 0;

        System.out.println(isNegative);

        System.out.println("======================"
        );

        // define a number and find out if it is even

        int number = 5;

        boolean isEven = number % 2 == 0;
        boolean isOdd = number % 2 != 0;

        System.out.println(isEven);
        System.out.println(isOdd);




    }
}
