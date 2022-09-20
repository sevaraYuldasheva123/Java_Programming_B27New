package day11_nested;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int validPassCode = 7021;

        System.out.println("Welcome to the ATM. Enter your card and Passcode");
        int userPassCode = input.nextInt();
        int attempt = 0;

        if(userPassCode == validPassCode){
            System.out.println("Logged in! \nSelect a number\n\t1.Check the balance \n\t2.Withdraw money\n\t3.Deposit money ");
            int selection = input.nextInt();

                if(selection ==1 ){
                    System.out.println("Your balance is 1_000_000$");
                }else if(selection == 2){
                    System.out.println("How much would you like to withdraw");
                    System.out.println("Withdrawing : $"+ input.nextInt());

                }else if(selection == 3){
                    System.out.println("How much would you like to deposit?");
                    System.out.println("Depositing : $"+ input.nextInt());
                }

        }else {
            System.out.println("Invalid passcode. You have 3 attempts before your card will get locked");

        }

    }
}
