package day19_loops;

import java.util.Scanner;

public class Color {

    public static void main(String[] args) {

        //write a program that will allow the user to select three colors
        //there need to be 3 unique colors selected

        Scanner input = new Scanner(System.in);

        int numOfColors = 0;
        String colors = "";

        while (numOfColors < 3){

        System.out.println("Enter the color");
        String inputColor = input.nextLine().toLowerCase();

        if(!colors.contains(inputColor)) {
            colors += " " + inputColor;
            numOfColors++;

        }
        }
        System.out.println(colors);

    }
}
