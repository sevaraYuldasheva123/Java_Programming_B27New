package day08_scanner;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        /*
        Create a program that will ask the user to enter two numbers. Add the numbers and print the result

         */

        Scanner input = new Scanner(System.in); // creating scanner object

        System.out.println("Enter first number");

        int num1 = input.nextInt(); // storing first number into variable

        System.out.println("Enter second number");

        int num2 = input.nextInt(); // storing second number into variable

        System.out.println("Numbers entered: "+ num1 + " and "+num2);






    }
}
