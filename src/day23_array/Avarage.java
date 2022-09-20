package day23_array;

public class Avarage {

    public static void main(String[] args) {

        double [] prices = {13.99, 19.14, 3.112, 65.332};

        double sum = 0;

        for(double price: prices){

            sum += price;

        }
        System.out.println(sum/ prices.length);

        System.out.println();
        //for loop

        double sumDouble = 0;
        for (int i = 0; i < prices.length; i++){

            sumDouble += prices[i];

        }
        System.out.println(sum / prices.length);


    }
}
