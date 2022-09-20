package day41_exceptions.try_catch;

public class FirstTry {

    public static void main(String[] args) {

        try {
            String s = "Hello World";
            System.out.println(s.charAt(1));
            System.out.println(s.charAt(100));
        }catch (StringIndexOutOfBoundsException e){ // parameter --> type of exception and name
            System.out.println("The String was too short. It went out of bounds");
        }

        System.out.println("Hello");

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Invalid time given");
        }

        System.out.println("World");
    }
}
