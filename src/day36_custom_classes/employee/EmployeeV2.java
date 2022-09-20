package day36_custom_classes.employee;

public class EmployeeV2 {

    String name;
    long id;
    String jobTitle;
    double salary;

    public EmployeeV2(String name) {
        this.name = name;
    }

    //constructor chaining starts here
    public EmployeeV2(String name, long id) {
        this(name); // calling the previous constructor
        this.id = id;
    }

    public EmployeeV2(String name, long id, String jobTitle) {
        this(name, id);
        this.jobTitle = jobTitle;
    }

    public EmployeeV2(String name, long id, String jobTitle, double salary) {
        this(name, id, jobTitle);
        this.salary = salary;
    }

    public String toString(){

        String  output = "Name: "+ name;

        if (id != 0){ // if id is initialized
            output += ", id: "+id;
        }

        if (jobTitle != null){ // if the job title is initialized
            output +=", job title: "+ jobTitle;
        }

        if (salary != 0){ // if salary is initialized
            output += ", salary: $"+salary;
        }

        return output;



    }
}
