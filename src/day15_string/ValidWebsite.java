package day15_string;

public class ValidWebsite {

    public static void main(String[] args) {

        /*
        declare a String for the website and check if it is valid
        valid website should start with www.
         website should end with .com .edu .gov .net
         */

        String website = "qqq.linkedin.ru";

        if(website.startsWith("www.") && website.endsWith(".com")){
            System.out.println("This is the valid website");
        }else if(website.startsWith("www.") && !website.endsWith(".com")){
            System.out.println("Website does not have valid ending");
        }else if(!website.startsWith("www.") && website.endsWith(".com")){
            System.out.println("Website does not have a valid starting");
        }else {
            System.out.println("Website is not valid: no valid starting and ending point");
        }

        System.out.println("------------------------------");

        String str = "today it is 80 degrees";

        System.out.println(str.contains("is it"));
    }
}
