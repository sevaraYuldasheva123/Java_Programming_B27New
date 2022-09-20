package day38_encapsulation;

public class TrafficLight {

    private  String color;

    public TrafficLight(String color){ // constructor
        setColor(color); // calling method inside the constructor
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if (color.equalsIgnoreCase("green") || color.equalsIgnoreCase("red") || color.equalsIgnoreCase("yellow")){
            this.color = color;
        }// if this if statement is false no color will be assigned
    }

}
