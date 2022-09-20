package day40_inheritance;

public class UsingFinal {

    public static void main(String[] args) {

        FinalExamples obj1 = new FinalExamples(20);

        System.out.println(obj1.a);
        System.out.println(obj1.b);

        // obj1 = 23;  can not change because this variable is final in  the object class

        // FinalExamples.PLANET ="Mars"; constant variable, can not be changed

    }
}
