package day18_loops;

import java.util.Scanner;

public class bot {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean run = true;
        System.out.println("Bot is awake");

        while (run){

            System.out.println("Enter your message");
            String message = scan.nextLine();

            switch (message){

                case "hello":
                    System.out.println("how are you?");
                    break;
                case "what is your age?":
                    System.out.println("I was programmed in July");
                    break;
                case  "what do you like?":
                    System.out.println("I like java");
                    break;
                default:
                    System.out.println("Sorry, I did not get that");
                    break;
                case "shutdown":
                    run = false;

            }

        }
    }
}
