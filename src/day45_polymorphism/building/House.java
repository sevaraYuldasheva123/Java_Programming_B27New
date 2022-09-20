package day45_polymorphism.building;

public class House extends Building1 implements HasBackyard {

    int numOfResidents;

    public House(String location, double price, int numOfResidents) {
        super(location, price);
        this.numOfResidents = numOfResidents;
    }

    @Override
    public void pay(){
        System.out.println("Paying mortgage");
    }

    @Override
    public void mowLawn(){
        System.out.println("Moving the lawn in the backyard");
    }

    @Override
    public String toString() {
        return super.toString()+ " Number of residents: "+numOfResidents;
    }
}
