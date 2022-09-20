package day43_abstraction.cars;

public class Road {

    public static void main(String[] args) {

        Toyota obj = new Toyota();
        BMW obj2 = new BMW();
        Tesla  obj3 = new Tesla();

        obj.start();

        obj2.start();

        obj3.start();
        obj3.charge();
    }
}
