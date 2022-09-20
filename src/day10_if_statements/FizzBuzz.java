package day10_if_statements;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        /*
        [Interview Question --> IQ]
        given a number n print the output based on the following conditions:
        if the number is devisible by 3 --> print fizz
        if num devisible by 5 --> print buzz
        if num is divisible both 3 and 5 print --> FizzBuzz
        if the number is not devisible by any print just the number

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = input.nextInt();

        String message = "";

        if(num % 3 == 0 && num % 5 == 0){
            message = "FizzBuzz";
        }else if(num % 3 == 0){
            message = "Fizz";
        }else if (num % 5 == 0){
            message = "Buzz";
        }else {
            System.out.println(num);
        }

        System.out.println(message);
    }
}
