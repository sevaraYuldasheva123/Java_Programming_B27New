package day10_if_statements;

import java.util.Scanner;

public class SalesBonus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the sales amount");
        int sales = input.nextInt();
        int bonus = 0;

        if(sales >= 10000 && sales < 15000){
            bonus = 5000;
        }
        if (sales >= 15000){
            bonus = 7000;
        }

        System.out.println("Sales = "+sales );
        System.out.println("Bonus = "+ bonus);
    }
}
