package day16_strings;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        /*
        create a program to ask the user to enter their first name and last name.
        Then print the initials of the person in uppercase format.
        The intials are made up of the first letters of the first and last names.
        Ex:
            james
            bond
            JB
        Ex:
            anna
            lee
            AL
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your First Name");
        String firstName = input.next();

        System.out.println("Please enter your last name");
        String lastName = input.next();

        String initials = ""+firstName.charAt(0) + lastName.charAt(0);
        initials = initials.toUpperCase();
        String fullName = firstName+" "+lastName;

        System.out.println("Full name: "+fullName);
        System.out.println("Initials: "+initials);
    }
}
