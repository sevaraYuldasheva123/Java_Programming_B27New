package day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class PartyList {

    public static void main(String[] args) {

        // how many people are coming to a prty and get all their names

        Scanner input = new Scanner(System.in);
        System.out.println("How many people are coming to a party?");

        int size = input.nextInt();

        String [] names = new String[size];

        for(int i = 0; i < size; i++){

            System.out.println( "Enter name of the person " + (i+1) );
            String guest = input.next();
            names[i] = guest;

        }
        System.out.println("Final list coming to a party: ");
        System.out.println(Arrays.toString(names));
    }
}
