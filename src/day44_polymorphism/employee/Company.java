package day44_polymorphism.employee;

import java.util.ArrayList;

public class Company {

    public static void main(String[] args) {

        ArrayList<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(new Tester("Sevara", "SDET", 150_000));
        allEmployees.add(new Developer("Kate", "Developer", 180_000));
        allEmployees.add(new Tester("Olga", "QA", 150_000));
        allEmployees.add(new Developer("Tatiana", "Lead Developer", 200_000));
        allEmployees.add(new Tester("Aziz", "SDET", 200000));

        double biggestSalary = allEmployees.get(0).salary; // default salary

        for (Employee each : allEmployees){
            if(each.salary > biggestSalary){
                biggestSalary = each.salary;
            }
        }
        System.out.println(biggestSalary);

        ArrayList <Tester> allTesters = new ArrayList<>();
        ArrayList <Developer> allDevelopers = new ArrayList<>();

        for (Employee each : allEmployees){
            if (each instanceof Tester){
                allTesters.add((Tester) each); // casting happens here
            }else if (each instanceof  Developer){
                allDevelopers.add((Developer) each); // casting happens here
            }
        }
        System.out.println("All Testers: "+allTesters);
        System.out.println("All Developers: "+allDevelopers);
    }
}
