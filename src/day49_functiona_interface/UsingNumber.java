package day49_functiona_interface;

public class UsingNumber {

    public static void main(String[] args) {

        NumberInterface evenOrOdd = (n) -> { //syntex for lambda expression (parameter) -> {code}

            if(n % 2 == 0){
                System.out.println(n+ " is even");
            }else {
                System.out.println(n + " is odd");
            }
        };

        evenOrOdd.test(50);

        NumberInterface cube = (n) -> {
            System.out.println(n * n * n);
        };

        cube.test(3);
    }
}
