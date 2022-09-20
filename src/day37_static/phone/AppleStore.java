package day37_static.phone;

import day37_static.phone.Iphone;

public class AppleStore {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("Iphone X", "black", 1000, 256);

        System.out.println(iphone1);

        Iphone iphone2 = new Iphone("Iphone 7" , "Silver", 1000, 256);
        System.out.println(iphone2);
    }
}
