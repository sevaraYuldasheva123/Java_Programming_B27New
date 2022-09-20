package day35_custom_classes.rectangle;

public class Rectangle {

    double base;
    double height;
    double perimeter;
    double area;

    public void calculateThePerimeter(){

        perimeter = 2 * base + 2 * height;

    }

    public void calculateTheArea(){

        area = base * height;

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
