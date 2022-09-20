package day08_scanner;

import java.util.Scanner;

public class Angles {

    public static void main(String[] args) {

        /*
        Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three number: ");

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();


        double sum = num1 + num2 + num3;

        boolean isTriangle = sum == 180;
        boolean isCircle = sum == 360;

        System.out.println("isTriangle = "+ isTriangle);
        System.out.println("isCircle = "+isCircle);




    }
}
