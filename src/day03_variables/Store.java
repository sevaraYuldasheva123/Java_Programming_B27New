package day03_variables;

public class Store {

    public static void main(String[] args) {

        int numberOfItems = 1000;

        System.out.println(numberOfItems + " in the store");


        double totalCost = 1_000_000.99; // underscores will not be printed

        System.out.println("totalCost = " + totalCost);

        float f = 19.99f;

        float f1 = 100;
        System.out.println("f1 = " + f1);// can be stored in float but will be printed as decimal --> number f1 = 100.0



        long population = 8000_000_000l;

        long population2 = 1000_000; // no need to put l because number is not too big, it can fit in int


    }
}
