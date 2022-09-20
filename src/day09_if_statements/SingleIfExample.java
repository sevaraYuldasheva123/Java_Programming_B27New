package day09_if_statements;

public class SingleIfExample {

    public static void main(String[] args) {

        if (true) {
            System.out.println("Hello");
        }

        int year = 2021;

        if (year == 2020 || year == 2021) {
            System.out.println("Stay home");
            System.out.println("Wash your hands");
            System.out.println("Social distancing");

        }

        System.out.println("==================");

        double price = 39.99;

        if (price >= 20) {
            System.out.println("Free shipping");
        }


    }
}
