package day39_inheritance.access.b;

import day39_inheritance.access.a.House;

public class TownHouse extends House {

    public static void main(String[] args) {

        TownHouse townHouse = new TownHouse();
        townHouse.address = "112233 sfe";
        townHouse.city = "Chicago";


    }
}
