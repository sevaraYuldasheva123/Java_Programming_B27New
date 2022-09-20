package day35_custom_classes.school;


public class School {

    String name;
    int totalNumberOfStudents;
    double avgGPA;

    /*
    // not the convencional way of crating a constructor
    public School(String inputName, int inputTotalNumberOfStudent, double inputAvgGPA){
        //this constructor works because there is no conflict in naming
        name = inputName;
        totalNumberOfStudents = inputTotalNumberOfStudent;
        avgGPA = inputAvgGPA;

    }

     */



    public School(String name, int totalNumberOfStudents, double avgGPA){

        this.name = name;
        this.totalNumberOfStudents = totalNumberOfStudents;
        this.avgGPA = avgGPA;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", totalNumberOfStudents=" + totalNumberOfStudents +
                ", avgGPA=" + avgGPA +
                '}';
    }


}
