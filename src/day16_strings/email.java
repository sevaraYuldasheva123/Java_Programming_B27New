package day16_strings;

public class email {

    public static void main(String[] args) {

        /*
        saim@cydeo.com

        name, domain
         */

        String email = "bruice@wayne.com";

        int indexOfAt = email.indexOf('@');
        String name = email.substring(0, indexOfAt);

        int indexOfDot = email.indexOf('.');
        String domain = email.substring(indexOfAt+1, indexOfDot);

        System.out.println("Full email: "+email);
        System.out.println("Name: "+ name);
        System.out.println("Domain: "+ domain);
    }
}
