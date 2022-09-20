package day07_scanner;

public class CastingExamples {

    public static void main(String[] args) {

                /*
        create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
         */

        float averageScore = 20.5f;
        byte num1 = (byte)averageScore;//float is bigger than byte so we need to cast, we are trying to cast the byte so it goes to (parenthesis)
        short num2 = (short) averageScore; // float is bigger so we cast to short
        int num3 =  (int)averageScore; // float is bigger so we need to cast to int
        long num4 = (long) averageScore; // float is bigger so we need to cast to long
        float num5 = averageScore; // same type no casting
        double num6 = averageScore; //double is bigger so no need to cast, done automatically
    
    }
}
