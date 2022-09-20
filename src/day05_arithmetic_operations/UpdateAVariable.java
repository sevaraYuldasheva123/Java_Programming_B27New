package day05_arithmetic_operations;

public class UpdateAVariable {

    public static void main(String[] args) {

        int a = 4;
        System.out.println(a); // printing just the value --> 4

        System.out.println(a+10); // value does not change , prints 14

        a= a + 20; // here we are reassigning the value --> 24
        System.out.println(a); // prints the updated value

        // shorthand operator version

        int b = 5;
        b+=30; //same as b = b+30
        System.out.println(b); //35
    }
}
