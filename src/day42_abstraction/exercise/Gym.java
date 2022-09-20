package day42_abstraction.exercise;

public class Gym {

    public static void main(String[] args) {

        // Exercise obj = new Exercise();  --> line is not valid because Exercise is an abstract class --> CAN NOT BE INSTANTIATED

        Running run = new Running();
        run.perform();
        run.getCaloriesBurned(30);

        System.out.println();

        Bench benching = new Bench();
        benching.perform();
        benching.getCaloriesBurned(20);
        benching.rackWeights();

        }
}
