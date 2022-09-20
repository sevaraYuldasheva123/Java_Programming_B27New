package day45_polymorphism.building;

public class Apartment extends Building1 implements HasBackyard {

    int monthOfLease;

    public Apartment(String location, double price, int monthOfLease) {
        super(location, price);
        this.monthOfLease = monthOfLease;
    }

    @Override
    public void pay() {
        System.out.println("Paying rent for apartment");
    }

    @Override
    public void mowLawn() {
        System.out.println("Opening the door to a balcony");
    }

    @Override
    public String toString() {
        return super.toString()+" Month of lease: " +
                monthOfLease;
    }
}
