package day10_if_statements;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.XmlOneway;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the month in number format to find out how many days a month has");
        int month = input.nextInt();
        int day = 0;

        boolean has31Days =  month ==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has28 = month == 2;

        if(has31Days){
            day = 31;
        }else if(has30Days){
            day = 30;
        }else if(has28){
            day = 28;
        }else {
            System.out.println("Invalid entry");
        }
        System.out.println("Entered month has "+ day+" days");
    }
}
