package day38_encapsulation.rectangle;

public class Rectangle {

    private double length;
    private double width;

    public double getLength(){ // getter method returns double
        return length;
    }

    public void setLength(double length){ // no return type
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }
}
