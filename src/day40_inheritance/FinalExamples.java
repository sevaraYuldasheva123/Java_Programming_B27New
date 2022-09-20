package day40_inheritance;

public class FinalExamples {

    public final int a = 10; // hard coded instance variable

    public final  int b;

    public static final String PLANET = "Earth"; // public static final makes it constant
    public FinalExamples(int num){
        b = num;
    }
}
