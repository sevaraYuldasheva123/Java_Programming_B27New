package day06_relational_operators;

public class Store {

    public static void main(String[] args) {

        int numOfItems = 0;
        double price = 0.0;

        System.out.println("Go and pick up some coffee");

        System.out.println("Items in the cart: "+ ++numOfItems);

        price+=3.55; //price = price+3.55;

        System.out.println("Go pick up some milk");

        System.out.println("add 1 gallon of milk "+ ++numOfItems);
        System.out.println("add 1 gallon of milk "+ ++numOfItems);

        price+=5.99; //price = price+5.99;

        double totalPrice = price;
        System.out.println("total price = "+totalPrice);
    }
}
