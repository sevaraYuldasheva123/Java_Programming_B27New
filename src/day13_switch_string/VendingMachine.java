package day13_switch_string;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        /*
        vending machine:
        menu
        1
        2
        3

        drinks
        4
        5
        6
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the vending machine. Select menu you want to see:\n\tSnacks\n\tDrinks");

        String menu = input.nextLine();

        switch (menu){

            case "Snacks":
                System.out.println("Pick your snack:\n1.Chips\n2.Cookise\n3.Pretzels\n4.Candy");
                int snackOption = input.nextInt();

                if(snackOption == 1){
                    System.out.println("Chips are selected");
                }else if(snackOption == 2){
                    System.out.println("Cookies are my favorite");
                }else if(snackOption == 3){
                    System.out.println("Pretzels dispending");
                }else if(snackOption == 4){
                    System.out.println("Candy coming right up");
                }else{
                    System.out.println("Not a valid entry");
                }

                break;

            case "Drinks":

                System.out.println("Pick your snack:\n1.Coke\n2.Diet Coke\n3.Sprite\n4.Coke Zero");
                int drinkOption = input.nextInt();

                if(drinkOption == 1){
                    System.out.println("Coke is selected");
                }else if(drinkOption == 2){
                    System.out.println("Diet Coke is selected");
                }else if(drinkOption == 3){
                    System.out.println("Sprite dispending");
                }else if(drinkOption == 4){
                    System.out.println("Coke Zero coming right up");
                }else{
                    System.out.println("Not a valid entry");
                }

                break;





        }




    }
}
