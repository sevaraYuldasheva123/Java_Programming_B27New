package day37_static.student;

import java.util.Arrays;

public class CydeoStudent {

    String name;
    String city;
    int group;
    Coffee myCoffee;


    static int batchNumber;
    static String schoolName;
    static String[] instructors; // static means one copy, belongs to class. all objects share

    static {
        batchNumber = 27;
        schoolName = "Cydeo";
        instructors = new String[]{"Saim", "Asya", "Adam"}; // created new String array and assigned inth the instructors reference
    }

    public CydeoStudent(String name, String city, int group) {
        this.name = name;
        this.city = city;
        this.group = group;
        myCoffee = new Coffee(16);
    }

    public void drink(){
        myCoffee.amountLeft -= 2;
    }

    public static void schoolInfo(){

        System.out.println(schoolName + " Batch: "+ batchNumber);
        System.out.println("Instructors: "+ Arrays.toString(instructors));

    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", group=" + group +
                '}';
    }
}
