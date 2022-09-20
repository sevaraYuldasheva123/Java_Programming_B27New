package homework;

import java.util.Scanner;

public class Loan {

    public static void main(String[] args) {

        /*

        create a class Loan

        declare and assign a credit score variable
        try to use ternary to determine of you are eligible for a loan
        you are eligible if you have a credit score of 700 or above

        if you are eligible print "loan approved"
        otherwise print "loan rejected. Sign up for our credit program"
         */

        //    boolean isGreen = false;
        //System.out.println(isGreen? "drive":"stop"); // if is green is true drive, else stop

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your credit score");


        int creditScore= input.nextInt();
        boolean isEligible =  creditScore >=700;

        System.out.println(isEligible?"Congratulations, Loan Approved":"We are sorry, but your Loan Rejected");
    }
}
