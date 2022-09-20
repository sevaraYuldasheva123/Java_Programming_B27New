package day14_string;

import javax.xml.transform.sax.SAXTransformerFactory;

public class StringMethods {

    public static void main(String[] args) {

        String item = "pen"; // string pool
        String item2 = new String("Pen");// directly in heap

        System.out.println(item == item2); // checks if the itm1 is same object as item 2 --> returns false

        System.out.println(item.equals(item2)); // checks the value of the object --> returns true

        System.out.println(item.equalsIgnoreCase(item2));

        System.out.println("==============");

        String username = "jamesbond";
        String password = "BOND007";

        System.out.println(username.equals("jamesbond"));


        System.out.println("==============");

        String day = "Tuesday";
        System.out.println(day.length()); // checks how many characters ,  returns int

        String day2 = "Friday";
        int len = day2.length();

        System.out.println("==============");

        String word = "Summer";
        String word2 = word.toUpperCase();

        System.out.println(word);
        System.out.println(word2);

        System.out.println("==============");

        String s = "            java         ";
        System.out.println(s.length());
        String s1 = s.trim();
        System.out.println(s);
        System.out.println(s1);


    }
}
