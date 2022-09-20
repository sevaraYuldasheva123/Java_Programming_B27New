package day19_loops;

import java.util.Scanner;

public class SecretNumbers {

    public static void main(String[] args) {
        /*
        write a program that will allow you to guess a secret number.
        Define a number in the code in a specific range, for example 1-100. Then the program is for the user to guess that number
        They will guess a number and get a response. They can keep guessing until they get is right
        give hints:
            number is bigger
            number is smaller

        bonus: keep track of the number of attempts it took to guess the number
         */

        Scanner input = new Scanner(System.in);

        int secretNumber = 87;
        int inputNumber;
        int attempts = 0;

        //run first check later
        do{
            System.out.println("Please Guess a number");
            inputNumber = input.nextInt();

            if(inputNumber < secretNumber){
                System.out.println("Secret Number is higher");
            }else if(inputNumber > secretNumber){
                System.out.println("Secret Number is lower");
            }

            attempts++;

        }while (secretNumber != inputNumber); // as long as numbers are not matching

        System.out.println("You guessed right");
        System.out.println("You guessed number in  "+attempts+" attempts");



    }
}
