package day19_loops;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        //write a program that calculates the factorial of a number
        // ex: !5 = 5 * 4 * 3 * 2 * 1 = 120

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        String msg = num + "! = ";

        int factorial = 1;

        for (int i = num; i > 1; i--){

            factorial *= i;
            msg += i + " * ";
        }
        msg += "1 = "+ factorial;
        System.out.println(factorial);
        System.out.println(msg);
    }
}
