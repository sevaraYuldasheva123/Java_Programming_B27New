package day43_abstraction.learning;

public class AppleStore {

    public static void main(String[] args) {

        //this is what we can access directly from the Interface
        System.out.println(Mac.brabd);
        System.out.println(Mac.os);
        Mac.getBrand();

        //use a class that implements the interface
        Desktop obj = new Desktop();
        obj.turnOn();
        obj.typing();
        //obj.getBrand(); can not access the static members from the class that implements that interface
    }
}
