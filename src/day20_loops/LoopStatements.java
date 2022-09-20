package day20_loops;

public class LoopStatements {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){

            if(i == 2){
                continue;
            }

            System.out.print(i + " ");

        }

        for (int i = 0; i < 100; i++){

            if(i % 2 == 0){
                continue; // will continue , meaning skipping
            }
            System.out.print(i + " ");

        }
    }


}
