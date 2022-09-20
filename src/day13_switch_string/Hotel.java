package day13_switch_string;

import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to JAVA Hotel");

        System.out.println("How many days will you be staying?");
        int days = input.nextInt();

        System.out.println("How many people do you have in your party?");
        int people = input.nextInt();

        String roomType;
        double price;


        switch (people){

            case 1:
                roomType = "Single room";
                price = days * 100;
                break;
            case 2:
                roomType = "Double room";
                price = days * 125;
                break;
            case 3:
            case 4:
                roomType = "Large room";
                price = days * people * 150;
                break;
            case 5:
            case 6:
            case 7:
                roomType = "Suite";
                price = days * 5000;
                break;

            default:
                roomType = "Sorry we do not have any rooms available for provided amount of people";
                price = 0;


        }
        System.out.println("\nInformation below:\nParty size: "+people+"\nType of the room: " +roomType+
                "\nDays staying: "+days+"\nTotal price: "+price);


    }
}
