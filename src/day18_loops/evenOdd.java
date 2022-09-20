package day18_loops;

public class evenOdd {

    public static void main(String[] args) {

        int limit = 100;
        int count = 1;

        //print all even numbers

        while (count <= limit){

            if(count % 2 == 0){
                System.out.print(count+" ");
            }
            count++;
        }

        System.out.println();
        //print all odd numbers backwords

        int back = limit;

        while (back >= 1){

            if(back % 2 == 1){ // if variable is odd

                System.out.print(back + " ");
            }
            back--;
        }
    }
}
