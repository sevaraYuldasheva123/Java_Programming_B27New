package day37_static;

public class Executions {

    public static void main(String[] args) {

        System.out.println(1); // just printing

    }
    public Executions(){
        System.out.println(2); // constructor, will not print since constructor was not called
    }

    static {
        System.out.println(3); // static bloch will be printing first since it will run when the class is loaded
    }
}
