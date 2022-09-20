package day32_arraylist;

import sun.security.krb5.JavaxSecurityAuthKerberosAccess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> drinks = new ArrayList<>(Arrays.asList("Soda", "Juice", "Water", "Coffee"));

        System.out.println("Welcome, Which drink would you like?");

        String selection = input.next();
        if (drinks.contains(selection)){
            System.out.println("Selection is vending");
        }else {
            System.out.println("Selection is not in the vending machine");
        }

    }
}
