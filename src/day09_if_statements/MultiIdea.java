package day09_if_statements;

import java.util.Scanner;

public class MultiIdea {

    public static void main(String[] args) {

        /*
        number --> Month
        1 jan
        2 febr
        3 march
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int month = scan.nextInt();

        if(month== 1){
            System.out.println("Month is January");
        }else if(month == 2){
            System.out.println("Month is February");
        }else if(month == 3) {
            System.out.println("Month is March");
        }else if(month == 4) {
            System.out.println("Month is April");
        }else if(month == 5){
                System.out.println("Month is May");
        }else if(month == 6) {
            System.out.println("Month is June");
        }else if(month == 7){
            System.out.println("Month is July");
        }else if(month == 8){
            System.out.println("Month is August");
        }else if(month == 9){
            System.out.println("Month is September");
        }else if(month == 10){
            System.out.println("Month is October");
        }else if(month == 11){
            System.out.println("Month is November");
        }else if(month == 12){
            System.out.println("Month is December");
        }


    }
}
