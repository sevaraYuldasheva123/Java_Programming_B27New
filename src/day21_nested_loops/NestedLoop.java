package day21_nested_loops;

public class NestedLoop {

    public static void main(String[] args) {
/*
        for(int i = 0; i < 3; i++){

            System.out.println("Hello World");
        }

        for(int i = 0; i < 3; i++){

            System.out.println("Hello Universe");
        }
 */
       for(int j = 0; j < 4; j++){ // outter loop

           for(int i = 0; i < 3; i++){//inner loop

               System.out.println("Hello World");
           }

           for(int i = 0; i < 3; i++){

               System.out.println("Hello Universe");
           }

       }



    }
}
