package day47_collections;

import my_utils.StringUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Map<String, Double> store = new HashMap<>();
        store.put( "Water", 2.99);
        store.put( "Bread", 4.55);
        store.put( "Milk", 2.89);

        store.put( "Fruits", 3.31);

        System.out.println("What item would you like?");
        String item = StringUtil.fixFormat(input.next()); // calling utility method to fix the format

        if (store.containsKey(item)){
            System.out.println(item + " is in stock, price is "+ store.get(item));
        }else {
            System.out.println(item+ " is not in stock");
        }





    }
}
