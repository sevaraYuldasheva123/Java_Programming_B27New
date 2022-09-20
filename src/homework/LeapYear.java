package homework;

public class LeapYear {

    public static void main(String[] args) {

        /*
    create a class LeapYear

    declare and assign a year variable
    check if the year is a leap year, a year will be a leap year if it is divisible by 4

         */

        int year = 1901;
        boolean isLeapYear = year % 4 ==0;

        System.out.println(isLeapYear);


    }
}
