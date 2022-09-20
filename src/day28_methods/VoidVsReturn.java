package day28_methods;

public class VoidVsReturn {

    public static void sayHello(){
        System.out.println("Hello");
    }

    public static String sayBye(){


        return "Bye"; // return value was not used , so we dont see any difference
    }

    public static void main(String[] args) {

        sayBye();
        System.out.println(sayBye()); // i will get Bye, because the string return type returns string
    }
}
