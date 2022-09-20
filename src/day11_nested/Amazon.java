package day11_nested;

public class Amazon {

    public static void main(String[] args) {

        double price = 100.99;
        boolean isPrime = false;

        if(isPrime){
            System.out.println("Free 2 days shipping");
        }else{
            //if we do not have prime
            if(price >= 25){
                System.out.println("Free shipping available");
            }else{
                System.out.println("shipping cost is 2.99");
            }
        }
    }
}
