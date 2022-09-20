package day10_if_statements;

import java.util.Scanner;

public class NumberToDay {

    public static void main(String[] args) {

        //if 1 --> Monday ....... and etc

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num == 1 ){
            System.out.println("It is Monday");
        }else if(num == 2){
            System.out.println("It is Tuesday");
        }else if(num == 3){
            System.out.println("It is Wednsday");
        }else if(num == 4){
            System.out.println("It is Thursday");
        }else if(num == 5){
            System.out.println("It is Friday");
        }else if(num == 6){
            System.out.println("It is Saturday");
        }else if(num == 7){
            System.out.println("It is Sunday");
        }else {
            System.out.println("Invalid entry, please try again");
        }

    }
}
