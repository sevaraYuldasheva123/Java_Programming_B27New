package day38_encapsulation;

public class Driving {

    public static void main(String[] args) {

        TrafficLight road1 = new TrafficLight("blue");

        System.out.println(road1.getColor());

        road1.setColor("green");
        System.out.println(road1.getColor());
    }
}
