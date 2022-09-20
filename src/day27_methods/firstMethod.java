package day27_methods;

public class firstMethod {

    //Access modifier Static modifier Return type Name(){  }
    public static void helloWorld(){

        System.out.println("Hello World!");


    }

    public static void helloWorld5(){

        for (int i = 0; i < 5; i++){
            helloWorld(); // calling the method

        }

    }


    public static void main(String[] args) {

        helloWorld(); // calling the method

        System.out.println();

        helloWorld5();



    }


}
