package day35_custom_classes.trafficLights;

public class Road {

    public static void main(String[] args) {

        TrafficLight light = new TrafficLight();
        light.color = "red";
        System.out.println(light.color);

        TrafficLight light1 = new TrafficLight("blue"); // calling the constructor with an argument
        System.out.println(light1.color);



    }
}
