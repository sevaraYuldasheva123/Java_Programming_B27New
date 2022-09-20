package day35_custom_classes.trafficLights;

public class TrafficLight {

    String color; // instance variable

    public TrafficLight(){ // default constructor ---> no parameter constructor


    }

    public TrafficLight(String inputColor){ // constructor with parameters

        boolean isValid = inputColor.equalsIgnoreCase("red")
                || inputColor.equalsIgnoreCase("yellow")
                || inputColor.equalsIgnoreCase("green");

        if (isValid){
            color = inputColor;
        }



    }

}
