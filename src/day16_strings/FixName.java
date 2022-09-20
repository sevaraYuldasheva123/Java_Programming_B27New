package day16_strings;

import java.util.Scanner;

public class FixName {

    public static void main(String[] args) {

        /*
        ask the user the first name
        aske the user enter last name

        print both names in proper format
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first name" );
        String firstName = input.next().toLowerCase();

        System.out.println("Please enter last name");
        String lastName = input.next().toLowerCase();

        String name = firstName.substring(0,1).toUpperCase()+firstName.substring(1,firstName.length());
        String last = lastName.substring(0,1).toUpperCase()+lastName.substring(1, lastName.length());

        System.out.println("Full name in right format: "+ name+" "+last);
    }
}
