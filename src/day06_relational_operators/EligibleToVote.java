package day06_relational_operators;

public class EligibleToVote {

    public static void main(String[] args) {

        int age = 18;
        boolean isCitizen = true;
        boolean hasCriminalBackround = true  ;
        boolean over18 = age >=18;

        Boolean isEligible = isCitizen &&  over18 && !hasCriminalBackround;

        System.out.println(isEligible);
    }
}
