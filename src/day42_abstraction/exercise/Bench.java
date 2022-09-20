package day42_abstraction.exercise;

public class Bench extends Lifting {

    // Bench is the concrete class --> should implement all abstract methods of Lifting and Exercise classes

    @Override
    public void rackWeights() {
        System.out.println("Putting the bar back on the rack");
    }

    @Override
    public void perform() {
        System.out.println("Bench press");
    }

    @Override
    public void getCaloriesBurned(int minutes) {
        System.out.println(10 * minutes);
    }
}
