package day10_if_statements;

import java.util.Scanner;

public class CampusTime2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a time from 0 to 23 in 24H format where 0 is Midnight");
        int time = input.nextInt();

        String message = "";

        if(time >= 6 && time <= 11){
            message = "Good morning";
        }else if( time >=12 && time <= 16){
            message = "Goog evening";
        }else if(time >=17 && time <= 23  || time >=0 && time <=5){
            message = "Good night";
        }else{
            message = "not a valid time provided";
        }

        System.out.println(message);
    }
}
