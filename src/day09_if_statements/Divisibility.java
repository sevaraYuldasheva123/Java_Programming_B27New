package day09_if_statements;

import java.util.Scanner;

public class Divisibility {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num =  scan.nextInt();

        if(num % 2 == 0){
            System.out.println(num+" is divisible by 2");
        }

        if(num % 3 == 0){
            System.out.println(num+" is divisible by 3");
        }

        if(num % 5 == 0){
            System.out.println(num+" is divisible by 5");
        }
    }
}
