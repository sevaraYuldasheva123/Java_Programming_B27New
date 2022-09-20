package day35_custom_classes.rectangle;

import day35_custom_classes.rectangle.Rectangle;

public class Shapes {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        rectangle1.base = 4.5;
        rectangle1.height = 8.2;
        rectangle1.calculateTheArea();
        rectangle1.calculateThePerimeter();

        System.out.println(rectangle1);
    }
}
