package day41_exceptions.hiding;

public class Run {

    public static void main(String[] args) {

        First.staticMethod();
        Second.staticMethod();

        new First().instanceMethodA();
        new Second().instanceMethod();
    }
}
