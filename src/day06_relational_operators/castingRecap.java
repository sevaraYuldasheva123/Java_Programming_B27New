package day06_relational_operators;

public class castingRecap {

    public static void main(String[] args) {

        int age = 40;
        long ageLong = age; // casting is made automatically --> going smaller to bigger

        long num = 100;
        int numInt = (int)num; // going from bigger to smaller --> we have to cast it


        long boxes = 30L;

        float f = 14.5F;
        int i = (int)f; // will lose data because number will become whole



    }
}
