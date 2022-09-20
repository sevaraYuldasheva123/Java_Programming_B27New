package day08_scanner;

import java.util.Scanner;

public class Revenue {

    public static void main(String[] args) {

        /*

        Create a program that will ask the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a price of an item");
        double price = scan.nextDouble();

        System.out.println("Enter quantity of purchased items: ");
        int quantity = scan.nextInt();

        double revenue = price * quantity;
        System.out.println("The revenue is equal : "+ revenue);

    }
}
