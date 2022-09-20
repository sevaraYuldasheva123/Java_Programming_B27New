package day04_variables;

public class MyName {
    public static void main(String[] args) {

        char first = 'S';
        char second = 'e';
        char third = 'v';
        char forth = 'a';
        char fifth = 'r';
        char six = 'a';

        System.out.println(first+second+third+forth+fifth+six); // will print some number related to char in asci table

        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(forth);
        System.out.print(fifth);
        System.out.println(six);

        System.out.println("My name is "+ first+second+third+forth+fifth+six); // will print my name is sevara because it starts with string
        //code reads left to right . Putting any string in the beginning will concatenate chars as characters
    }
}
