package day36_custom_classes.employee;

public class Employee {

    String name;
    long id;
    String jobTitle;
    double salary;

    public Employee(String name){

        this.name = name;

    }

    public Employee(String name, long id){
        this.name = name;
        this.id = id;
    }

    public Employee(String name, long id, String jobTitle){

        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;

    }


    public Employee(String name, long id, String jobTitle, double salary){

        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public void goToMeeting(){

        System.out.println(name + " is going to a meeting");

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
