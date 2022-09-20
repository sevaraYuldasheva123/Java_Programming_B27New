package day28_methods;

public class CharMethods {


        //print the letters from A-Z
    public static void getUpperAtoZ(){
        for (char letter = 'A'; letter <= 'Z';letter++ ){
            System.out.print(letter + " ");
        }
        System.out.println(); //to break the line


    }
    //print the letters from a-z
    public static void getLowerAtoZ() {
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println(); //to break the line

    }


    //print the letters from Z-A
    public static void getUpperZtoA() {
        for (char letter = 'Z'; letter >= 'A'; letter--) {
            System.out.print(letter + " ");
        }
        System.out.println(); //to break the line

    }


    //print the letters from z-a

    public static void getLowerZtoA() {
        for (char letter = 'z'; letter >= 'a'; letter--) {
            System.out.print(letter + " ");
        }
        System.out.println(); //to break the line

    }

    //print the letters from 0-9

    public static void getNumber0to9(){
        for (int i = 0; i <= 9; i++){
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        getNumber0to9();
        getLowerAtoZ();
        getUpperAtoZ();
        getLowerZtoA();
        getUpperZtoA();
    }





}
