package day37_static.car;

public class Car {

    String model;
    Driver driver;

    //constructor with 4 argument
    //when i call the car constructor the code inside is calling the Driver Constructor
    public Car(String model, String name, long licenceNumber, char licenceType){
        this.model = model;
        //creating the driver object
        driver = new Driver(name, licenceNumber, licenceType);
    }
    public Car(String model, Driver driver){

        this.model = model;
        this.driver = driver;

    }
}
