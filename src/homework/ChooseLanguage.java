package homework;

import java.util.Scanner;

public class ChooseLanguage {

    public static void main(String[] args) {

        /*
        create a class ChooseLanguage

    ask the user to enter a number based on the language they wanted to use.
        1 - English
        2 - Spanish
        3 - Turkish
        4 - Russian
        5 - French
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 5");
        int number = scanner.nextInt();

        if(number == 1){
            System.out.println("hello, thanks for your call");
        }else if(number == 2){
            System.out.println("hola, gracias para llamar");
        }else if(number == 3){
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        }else if(number == 4){
            System.out.println("privet, spasibo za vash zvonok");
        }else if(number == 5){
            System.out.println("Merci ,pour votre appel");
        }else {
            System.out.println("Wrong entry, We will use English by default");
        }
    }
}
