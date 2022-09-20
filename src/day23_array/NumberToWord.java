package day23_array;

import java.util.Scanner;

public class NumberToWord {

    public static void main(String[] args) {

        //create a program that ask user to enter the number and print number as word

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number from 0 to 14 to see the number in word format");

        int num = input.nextInt();

        String numWords[] = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                            "eleven", "twelve", "thirteen", "fourteen", "fifteen"};

        if (num >= 0 && num <=15){
            System.out.println(numWords[num]);

        }else {
            System.out.println("Invalid number, range is from 0 to 15");
        }
    }
}
