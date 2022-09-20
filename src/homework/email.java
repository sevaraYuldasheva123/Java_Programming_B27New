package homework;

import java.util.Scanner;

public class email {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your email");
        String email = scanner.nextLine();

        //WRITE YOUR CODE BELOW
        int indexOfDash = email.indexOf('_');
        int indexOfAt = email.indexOf('@');
        int indexOfDot = email.indexOf('.');



        String firstName = email.substring(0, indexOfDash);
        firstName = firstName.substring(0 ,1).toUpperCase().concat(firstName.substring(1).toLowerCase());

        String lastName = email.substring(indexOfDash+1, indexOfAt);
        lastName = lastName.substring(0,1).toUpperCase().concat(lastName.substring(1).toLowerCase());

        String domain = email.substring(indexOfAt+1, indexOfDot) ;
        domain = domain.substring(0 ,1).toUpperCase().concat(domain.substring(1).toLowerCase());


        System.out.println("First name: "+ firstName);
        System.out.println("Last name: "+ lastName);
        System.out.println("Domain: "+ domain);
    }
}
