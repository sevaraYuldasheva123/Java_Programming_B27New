package day09_if_statements;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();

        if(num % 2 == 0){ // if the number is evenly devisible without any left over
            System.out.println("The number is EVEN");
        }
        if (num % 2 != 0){ // if the number is NOT evenly devisible
            System.out.println("Number is ODD");
        }
    }
}
