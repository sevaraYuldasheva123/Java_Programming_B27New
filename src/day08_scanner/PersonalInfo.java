package day08_scanner;

import java.util.Scanner;

public class PersonalInfo {

    public static void main(String[] args) {

        /*
        ask for first name
        ask for last name
        ask for address
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String name = input.next(); // that will allow to get string

        System.out.println("Enter your last name:");
        String lastName = input.next();

        input.nextLine(); // for the enter input

        System.out.println("Enter your address:");
        String address = input.nextLine(); //next line because address has multiple lines

        System.out.println("Information entered: \nFirst name = "+name+"\nLast name = "+lastName+"\nAddress: "+address);
    }
}
