package day38_encapsulation;

public class TestingAccessModifiers {

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a); // private --> anywhere
        System.out.println(obj.b); // default --> same package
        // --> System.out.println(obj.c); can not be accessed because the variable is private / can be only accessed within same class
    }
}
