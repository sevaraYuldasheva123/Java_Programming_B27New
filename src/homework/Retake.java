package homework;

public class Retake {

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
        float grade = 100;
        int attempt = 3;
        int percentage;

        if (attempt == 1){
            System.out.println("Congratulations, your grade is "+grade);
        }else if(attempt == 2){
            percentage = 20;
            grade = (grade - percentage)*100 / 100;
            System.out.println("This is your second attempt, your calculated grade is: "+grade);
        }else {
            percentage = 35;
            grade = (grade - percentage)*100 / 100;
            System.out.println("This is your third attempt, your calculated grade is: "+grade);

        }
    }
}
