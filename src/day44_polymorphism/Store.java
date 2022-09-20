package day44_polymorphism;

import day43_abstraction.clothes.Clothes;
import day43_abstraction.clothes.HasHood;
import day43_abstraction.clothes.Jacket;
import day43_abstraction.clothes.Tshirt;

import java.util.ArrayList;

public class Store {

    public static void main(String[] args) {

        //all possible references of TShirt and Jacket
        Tshirt item1 = new Tshirt(); // reference to itself
        Clothes item2 = new Tshirt();// reference to parent

        //Jacket:
        Jacket jacket1 = new Jacket();// reference to itself
        Clothes jacket2 = new Jacket();// reference to parent
        HasHood jacket3 = new Jacket(); // reference to the interface that Jacket class implemented

        Clothes[] inventory = new Clothes[5];
        inventory[0] = new Tshirt();
        inventory[1] = item1;
        inventory[2] = item2;
        inventory[3] = jacket1;
        inventory[4] = jacket2;

        //inventory[5] = jacket3; will not work because Interface HasHood doe not have reference to Clothes

        ArrayList<Clothes> list = new ArrayList<>();
        list.add(new Jacket());
        list.add(new Tshirt());

        for (Clothes each : inventory){
            each.wear();
        }

    }
}
