package day06_relational_operators;

public class LogicalExamples {

    public static void main(String[] args) {

        // && --> AND  both of the values should be true
        // &&
        boolean isWeekend = true;
        boolean isGoodTemp = false;
        boolean doBBQ = isWeekend && isGoodTemp;

        System.out.println("Do BBQ : "+doBBQ); // expected return --> true because both of the values are true

        //  || --> OR  one of the values should be true
        boolean isTeacher = false;
        boolean isPolice = false;
        boolean isFireFighter = true;
        boolean getDiscount = isTeacher || isPolice || isFireFighter; // 1 of the conditions should be true

        System.out.println("Will get a discount : "+ getDiscount);

        System.out.println();
        //goal 5 < number < 10
        int number = 8;
        System.out.println(number > 5 && number <10); // true --> matching 2 conditions

        int age = 100;
        boolean invalidAge = age < 0 || age >120;
        System.out.println(invalidAge);

    }
}
