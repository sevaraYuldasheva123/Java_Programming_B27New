package day16_strings;

import java.util.Scanner;

public class Adress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your adress");

        String address = input.nextLine();
        address = address.toUpperCase().trim();

        if(address.startsWith("500")){
            System.out.println("House is on the right side");
        }else if(address.startsWith("600")){
            System.out.println("House is on the left side");
        }

        System.out.println(address);

        if(address.contains("DRIVE")){
            System.out.println("We are on Drive");
        }else if(address.contains("LANE")){
            System.out.println("We are on the Lane");
        }else if(address.contains("AVE")){
            System.out.println("House contains Avenue");
        }
    }
}
