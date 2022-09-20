package day09_if_statements;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How much do you want to withdraw?");
        double amountToWithdraw = input.nextDouble();

        double balance = 1_000_000;


        if(amountToWithdraw > balance){
            System.out.println("Insufficient funds");
        }
        if(amountToWithdraw < balance){
            System.out.println("You have enough money to withdraw");
            System.out.println("Funds remaining: "+ (balance-amountToWithdraw));
        }
    }
}
