package homework;

public class School {

    public static void main(String[] args) {

        /*
        Add a new class School
        add main method

        declare and assign all these variables:
        (all int) grade1, grade2, grade3, grade4, grade5

        assign the number of students in each grade

        extra: try to create another variable to find the total number of students in the whole school

        (all double) average gpa, number of school days, number of snow days
         */
        int grade1 = 10;
        int grade2= 11;
        int grade3 = 12;
        int grade4 = 15;
        int grade5 = 17;

        int totalNumberOfStudents = grade1+grade2+grade3+grade4+grade5;

        System.out.println("Total number of students in this school is : "+ totalNumberOfStudents);

        double avgGPA = 3.5;
        double numberOfSchoolDays = 267.00;
        double numberOfSnowDays = 15;

        System.out.println();

        System.out.println("The avarage GPA of students in this school is "+
                            avgGPA+". \nNumber of attended school days is : "
                            +numberOfSchoolDays+". \nNumber of snow days this year is: " + numberOfSnowDays);

    }
}
