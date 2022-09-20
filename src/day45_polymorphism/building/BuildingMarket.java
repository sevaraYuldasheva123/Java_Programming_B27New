package day45_polymorphism.building;

import java.util.ArrayList;

public class BuildingMarket {

    public static void main(String[] args) {

        ArrayList<Building1> allBuildings = new ArrayList<>();
        allBuildings.add(new House("New York", 400_000,4));
        allBuildings.add(new Apartment("Texas", 3_000_000, 6));
        allBuildings.add(new OfficeBuilding("Virginia", 20_000_000, 6));

        allBuildings.add(BuildingUtil.search("McLean"));
        allBuildings.add(BuildingUtil.search("Great Falls"));

        Building1 mostExspensive = allBuildings.get(0); //default value

        for (Building1 eachBuilding : allBuildings){
            if (eachBuilding.price > mostExspensive.price){
                mostExspensive = eachBuilding;
            }
        }
        System.out.println(mostExspensive);

        //filter all the buildings within the certain price range
        ArrayList<Building1> filterBuldings = new ArrayList<>(allBuildings);
        filterBuldings.removeIf(p -> p.price >=2000_000 || p.price <= 300_000);

        System.out.println(filterBuldings);

    }
}
