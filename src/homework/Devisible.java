package homework;

import java.util.Scanner;

public class Devisible {

    public static void main(String[] args) {

        /*

Create a program that will ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values

    Ex:
    Enter a number
    65

    65 is divisible by 2: false
    65 is divisible by 3: false
    65 is divisible by 5: true

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        boolean devisible2 = num%2==0;
        boolean devisible3 = num%3==0;
        boolean devisible5 = num%5==0;

        System.out.println(devisible2);
        System.out.println(devisible3);
        System.out.println(devisible5);


    }
}
