package day09_if_statements;

import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {

        //program for signing up to join newslettler

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Enter your email");
        String email = scan.next();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Do you want to sign up for extra newsletter T/F?");
        boolean extra = scan.nextBoolean();

        scan.nextLine();

        System.out.println("How did you hear about us?");
        String hearFrom = scan.nextLine();

        String report = "Subscription Info: \nFull name: "+ fullName+"\nEmail: "+email+"\nAge: "+age+"\nSigning up for extra? "+
                        extra+"\nHow did you hear about us? "+hearFrom;

        System.out.println(report);
    }
}
