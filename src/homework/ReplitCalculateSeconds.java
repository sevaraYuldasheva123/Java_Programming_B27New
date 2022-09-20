package homework;


import java.util.Scanner;

public class ReplitCalculateSeconds {

    public static void main(String[] args) {

        /*
        Write a program that will take a number of seconds and converts it to a number of hours, minutes and seconds

Create a Scanner object
Declare four int variables: inputSeconds, hours, minutes, seconds
Ask the user to enter the total number of seconds:
Enter seconds:
Taking the given number of total seconds calculate how many hours come from that many seconds,
then how many left over minutes can come from those seconds and finally how many leftover seconds there is.

Hint: Use % (remainder) and / operators to calculate the hours, minutes, and seconds


         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter seconds:");
        int inputSeconds = input.nextInt();

        int seconds =inputSeconds;
        int minute = seconds / 60;
        double hours  = minute/ 60;

        int leftOverMinutes = (inputSeconds % 3600) / 60 ;
        int leftOverSeconds = inputSeconds % 3600;

        System.out.println("There are : "+hours+ " hours in the inputed seconds");
        System.out.println("Left over minutes = "+leftOverMinutes);
        System.out.println("Left over seconds = "+leftOverSeconds);




    }
}
