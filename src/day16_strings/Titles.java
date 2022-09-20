package day16_strings;

import java.util.Scanner;

public class Titles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your title:");


        String name = input.nextLine();
        name = name.toLowerCase();

        if(name.startsWith("mr") || name.startsWith("mister")){
            System.out.println("Hello Sir");
        }else if(name.startsWith("miss") || name.startsWith("madam") || name.startsWith("ms")){
            System.out.println("Hello Madam");
        }else if(name.startsWith("doctor") || name.startsWith("dr")){
            System.out.println("Hello Doctor");
        }

        if(name.endsWith("sr")){
            System.out.println("Nice to meet you Senior");
        }else if(name.endsWith("jr")){
            System.out.println("Nice to meet you Junior");
        }
    }
}
