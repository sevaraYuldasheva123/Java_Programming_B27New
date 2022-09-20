package day38_encapsulation.rectangle;

import day38_encapsulation.rectangle.Rectangle;

public class useRectangle {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        rectangle1.setLength(10);
        rectangle1.setWidth(5);

        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());
    }
}
