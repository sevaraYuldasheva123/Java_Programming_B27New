package day43_abstraction.learning;

public interface Mac {

    public static  final String brabd = "Apple"; // public static final is by default
    String os = "IOS"; // it is public static final by default

    void turnOn(); // public abstract method by default

    public static void getBrand(){ // it is already public by default
        System.out.println("The brand is Apple");
    }

    public default void typing(){ // default allows us to create a method with implementation in the interface.
        // it is NOT the default access modifier. This is an instance method for the class that implements the Interface
        System.out.println("Typing on the apple keyword");

    };
}
