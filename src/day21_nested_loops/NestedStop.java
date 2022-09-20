package day21_nested_loops;

public class NestedStop {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){

            for (int j = 0; j < 3; j++){
                if(i % 2 == 1) continue;
                System.out.println(i + " " + j);
            }
        }


        for (int i = 0; i < 5; i++){

            for (int j = 0; j < 3; j++){

                System.out.println(i + " " + j);
            }
        }


    }
}
