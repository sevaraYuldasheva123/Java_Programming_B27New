package day29_methods;

import my_utils.StringUtil;


public class Picture {

    public static void main(String[]args){


        draw("vase with flowers" , "blue orange and red");
    }

    public static void draw (){

        System.out.println("Drawing circle");
    }

    public static void draw(String color){

        System.out.println("Drawing with "+ color);
    }

    public static  void draw(int size){
        System.out.println("making picture of "+ size);
    }

    public static void draw(String pictureOf, String color){
        System.out.println("Drawing "+pictureOf+" with "+color+" color");
    }



}
