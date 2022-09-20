package day08_scanner;

import java.util.Scanner;

public class EmployeeReport {

    public static void main(String[] args) {

        /*
        full name
        job title
        salary
        company hq
        full time
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your job title:");
        String jobTitle = input.nextLine();

        System.out.println("Enter your hourly rate: ");
        double hourlyRate = input.nextDouble();

        input.nextLine();

        System.out.println("Enter how many hours you work a week?");
        int hours = input.nextInt();

        double salary = hours * 52*hourlyRate; // yearly salary

        input.nextLine();

        System.out.println("Where is your Companies Head Quarters?");
        String hqLocation = input.nextLine();

        System.out.println("Are you full time?");
        boolean isFullTime = input.nextBoolean();

        String report = fullName+ " is a "+ jobTitle+" with the Salary of : "+salary+" working fulltime: "+isFullTime+" . Company is located in "+hqLocation;

        System.out.println(report);

    }
}
