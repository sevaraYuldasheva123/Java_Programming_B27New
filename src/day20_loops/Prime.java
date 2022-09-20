package day20_loops;

public class Prime {

    public static void main(String[] args) {

        // prime number is the number that can be only devisible by 1 and itself only --> not evenly devisible in most cases

        int num = 13;

        boolean isPrime = true;

        for (int i = 2; i < num; i++){

            if(num % i == 0){
                isPrime = false;
            }

        }
        System.out.println(isPrime? "Number is Prime":"Number is not Prime");


    }
}
