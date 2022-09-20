package day42_abstraction.exercise;

public class Running extends Exercise { // <--- this is first concrete class, we have to override all abstract methods of parent class


    @Override
    public void perform() {
        System.out.println("I am running");
    }

    @Override
    public void getCaloriesBurned(int minutes) {
        System.out.println(minutes * 10);
    }
}
