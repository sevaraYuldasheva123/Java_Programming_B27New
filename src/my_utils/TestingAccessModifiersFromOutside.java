package my_utils;

import day38_encapsulation.AccessModifiers;

public class TestingAccessModifiersFromOutside {

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a); // public can be accessed from anywhere
       //-->  System.out.println(obj.b);  default --> not being accessed because it is not within same package
       //-->  System.out.println(obj.c); private --> can be visible and accessed within same class
    }
}
