package day07_scanner;

import java.util.Scanner;

public class FirstScannerExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        System.out.println("This is your number: "+number);

        // for the quiz

        long l = 200L;
        double d = 19.99;
        float f = 10;

        //f = d; // dont compile
        f = l; //compiles
        //l = d; //does not compile
        //l = f; //does not compile
        d = f; //compiles
        d = d; //compiles



    }

}
