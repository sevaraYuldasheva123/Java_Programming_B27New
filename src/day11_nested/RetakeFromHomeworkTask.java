package day11_nested;

public class RetakeFromHomeworkTask {

    public static void main(String[] args) {

        /*
    create a class Retake

    declare and assign a grade variable
    declare and assign an attempt number

    Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:

        If its the first attempt -> subtract 10%
        If its the second attempt -> subtract 20%
        If its the third attempt -> subtract 35%

    Based on the retake attempt number calculate the final grade
         */

        double grade = 75;
        int attemptNumber = 2;
        double finalGrade = 0;

        if(attemptNumber == 1){
            finalGrade = grade * 0.9; //90% of the grade , which is minus 10%
        }else if(attemptNumber == 2){
            finalGrade = grade *0.8; //we are keeping 80% of the grade
        }else if(attemptNumber == 3){
            finalGrade = grade * 0.65; //we are keeping 65 %
        }
        System.out.println(finalGrade);
    }
}
