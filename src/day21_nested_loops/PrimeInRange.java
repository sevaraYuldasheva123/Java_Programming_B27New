package day21_nested_loops;

import java.util.Scanner;

public class PrimeInRange {

    public static void main(String[] args) {

        // prime number only devisible by 1 and itself

        //print all prime numbers up to certain range

        Scanner input = new Scanner(System.in);
        System.out.println("What number do you want to go to?");

        int range = input.nextInt();

        for (int i = 2; i <= range; i++){//outter loop checks the numbers from 2 to the range

            boolean isPrime = true;

            //inner loop if the number is prime
            for (int j =2; j < i; j++){

                if(i % j == 0){ // the number we are checking (i) is evenly devisible by the values from 2 to number it means its not prime
                    isPrime = false;
                    break; // this break stops the inner loop
                }
            }

            if(isPrime){
                System.out.println(i);
            }


        }




    }
}
