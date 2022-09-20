package day18_loops;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        int validPin = 1234;
        int userPin;
        int limitOfInput = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter your Pin");
            userPin = input.nextInt();
            limitOfInput++;

        }while (limitOfInput <= 3 && userPin != validPin);


        if(limitOfInput < 3 && userPin == validPin){
            System.out.println("Logged out");
        }else {
            System.out.println("Account is locked, too many attempts");
        }

    }
}
