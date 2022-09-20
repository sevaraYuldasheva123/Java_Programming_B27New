package day40_inheritance;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Parent {

    public static void Hello(){
        System.out.println("Hello from Parent");
    }
}


class Child extends Parent{

    // @Override --> can not be used because it is not actual overriding. Static Methods can not be overiden IT CALLS METHOD HIDING
    public static void Hello(){
        System.out.println("Hello from Child");
    }

}


class Run{

    public static void main(String[] args) {

        Parent.Hello();
        Child.Hello();
    }
}
