package day41_exceptions.try_catch;

public class ExampleOne {

    public static void main(String[] args) throws Exception{

        String s = null;
        //System.out.println(s.length()); --> this will cause Null Pointer Exception

        s = "hello";
        //System.out.println(s.charAt(10)); --> this will cause String Out of Bounds Exception

        System.out.println("Hello");

        Thread.sleep(5000); // stops the program for 5 seconds (5000 miliseconds)
    }
}
