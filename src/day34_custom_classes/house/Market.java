package day34_custom_classes.house;

import day34_custom_classes.house.House;

public class Market {

    public static void main(String[] args) {

        House house1 = new House();

        house1.type = "Single house";
        house1.squareFeet = 1500;
        house1.numberOfBedrooms = 5;
        house1.numberOfBathrooms = 2;
        house1.inCity = true;
        house1.hasGarage = true;

        System.out.println(house1.calculateMortgage());
        System.out.println(house1);

    }
}
