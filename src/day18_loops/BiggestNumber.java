package day18_loops;

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {

        // ask user to add 5 numbers and choose biggest

        Scanner input = new Scanner(System.in);
        int max = -2147483648; // <-- smallest int number
        int min = 2147483647; // <-- biggest int number

        int num = 0;

        while (num++ < 5){ // iterating on this line

            System.out.println("Please enter your number");
            int inputNumber = input.nextInt();

            if(inputNumber > max){
                max = inputNumber;
            }

            if (inputNumber < min){
                min = inputNumber;
            }

        }

        System.out.println("Your Max number is: "+ max);
        System.out.println("Your Min number is: "+ min);





    }
}
