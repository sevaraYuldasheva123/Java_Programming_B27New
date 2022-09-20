package day38_encapsulation;

public class AccessModifiers {

    public int a = 5; // public access modifier <-- anywhere in the project
    int b = 10; // default access modifier by default  <-- within the package
    private int c = 20; // private access modifier <-- within the class

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }
}
