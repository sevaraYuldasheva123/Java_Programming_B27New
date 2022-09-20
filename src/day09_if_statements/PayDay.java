package day09_if_statements;

import java.util.Scanner;

public class PayDay {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to salary calculator!");
        System.out.println("Please enter the amount of hours you worked:");

        int hoursPerWeek = input.nextInt();

        double hourlyRate = 50;


        double netPay;

        if(hoursPerWeek > 40){
            //overtime
            int overtimeHours = hoursPerWeek - 40; // to find out how many hours are extra
            netPay = hourlyRate * 40; // to calculate the base pay for 40 hours
            netPay += hourlyRate* overtimeHours * 1.5;


        }else {
            //worked under or equal to 40 hours
            netPay = hourlyRate * hoursPerWeek;
        }


        System.out.println("This your calculated net pay for the week is: "+netPay);

        System.out.println("Thank you for using the service! Have a good day!");


    }
}
