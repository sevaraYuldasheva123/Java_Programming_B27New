package day08_scanner;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the item name: ");
        String item1 = input.next();

        System.out.println("Enter the item's price:");
        double price = input.nextDouble();

        System.out.println("Enter quantity of the item");
        int quantity = input.nextInt();

        double total = price*quantity;

        System.out.println("Your total is: "+total);
    }
}
