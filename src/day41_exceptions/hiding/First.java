package day41_exceptions.hiding;

public class First {

    public  static void staticMethod(){
        System.out.println("Static Method from First");
    }

    public void instanceMethodA(){
        staticMethod();
    }
}
