package day41_exceptions.hiding;

import day41_exceptions.hiding.First;

public class Second extends First {

    public static void staticMethod(){ // method hiding is happening here
        System.out.println("Static Method from second");
    }

    public void instanceMethod(){
        staticMethod();
    }
}
