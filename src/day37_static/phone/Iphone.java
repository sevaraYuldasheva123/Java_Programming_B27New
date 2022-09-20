package day37_static.phone;

public class Iphone {

    //instance variables - need object in order to use them (multiple copies- every object has its own copy)
    String model;
    String color;
    double price;
    int storage;

    //static variables - one value
    static String os;
    static String brand;

    // static block is used to initialize the static variables
    static {
        System.out.println("Static block runs");
        os = "IOS";
        brand = "Apple";
    }

    // constructor is used to initialize instance variables
    public Iphone(String model, String color, double price, int storage) {
        System.out.println("Constructor runs");
        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
