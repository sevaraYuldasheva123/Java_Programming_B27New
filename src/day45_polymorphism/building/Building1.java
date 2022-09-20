package day45_polymorphism.building;

public abstract class Building1 {

    String location;
    double price;

    public Building1(String location, double price){
        this.location = location;
        this.price = price;
    }

    public abstract void pay();

    public String toString(){
        return "Location: " + location + ", price: " + price;
    }




}
