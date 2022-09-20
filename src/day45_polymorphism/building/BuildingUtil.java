package day45_polymorphism.building;

public class BuildingUtil {

    public static void main(String[] args) {

        House house1 = new House("Paris", 100_000_000, 10);// reference of itself

        Building1 house2 = new House("New York", 2000_000, 4); // reference of super class

        HasBackyard house3 = new House("Seattle", 3000_000, 5); // reference of an interface

        house3.mowLawn();

        System.out.println(rent(house2));

        System.out.println(rent(new OfficeBuilding("Texas", 400000, 4)));

        System.out.println(rent(new Apartment("Vienna", 500_000, 4)));

        System.out.println(search("McLean"));




    }

    /*
      create a class BuildingUtil

    create a static method Rent(Building obj)
        return: double
        parameters: Building type

        implementation:
            if the Building is House type return 1500
            if the Building is Apartment type return 800
            if the Building is OfficeBuilding type return 2000
     */

    public static double rent(Building1 building){

        if (building instanceof House){
            return 1500;
        }else if (building instanceof Apartment){
            return 800;
        }else if (building instanceof OfficeBuilding){
            return 2000;
        }else {
            return -1;
        }

    }

    public static Building1 search(String location){ // we can return anything that extended Building class

        if(location.equals("Great Falls")){
            return new House("Great Falls", 500_000, 4);
        }else if(location.equals("Fairfax")){
            return new Apartment("Fairfax", 250_000, 6);
        }else if (location.equals("McLean")){
            return new OfficeBuilding("McLean", 2000_000, 6);
        }

        return null;

    }


}
