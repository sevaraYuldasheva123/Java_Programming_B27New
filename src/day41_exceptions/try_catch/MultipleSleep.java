package day41_exceptions.try_catch;

public class MultipleSleep {

    public static void main ( String[] args) throws InterruptedException{

        System.out.println("Hello");

        Thread.sleep(3000);

        System.out.println("Second Line");

        Thread.sleep(3000);

        System.out.println("Middle Line");

        Thread.sleep(3000);

        System.out.println("Bye");
    }
}
