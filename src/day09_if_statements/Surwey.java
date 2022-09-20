package day09_if_statements;

import java.util.Scanner;

public class Surwey {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Are you a student? T/F");
        boolean isStudent = scan.nextBoolean();
        String report = "";

        if(isStudent){
            System.out.println("What are you studying?");
            String subject = scan.next();
            report += "Studiying: "+ subject;

        }

        System.out.println("Do you live in a city? T/F");

        if(scan.nextBoolean()){
            System.out.println("Cool, cities are loud and fun");
        }else {
            System.out.println("How many years have you lived in the suburb?");
            int years = scan.nextInt();
            report +="\nLiving in suburbs for "+years +" years";

        }
        System.out.println(report);
    }
}
