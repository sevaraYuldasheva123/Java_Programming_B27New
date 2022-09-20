package day44_polymorphism.employee;

public class Scrum {

    public static void main(String[] args) {

        //reference of the super classes
        Person tester1 = new Tester("James Bond", "Secret Agent", 150_000);

        //Person variable only has access to name variable --> tester.name
        //These are not accessible because Person reference does not have access:
        //tester1.work();
        //tester1.create();

        Employee tester2 = new Tester("Jose Penso", "SDET", 200_000);
        //Tester two has access to all below because Employee reference has access to all of those:
       // tester2.jobTitle;
       // tester2.salary;
       // tester2.name;
        tester2.work();

        Object tester3 = new Tester("Milana", "SDET", 130_000);
        // tester3 has no access to any of the name, salary job title variables or work method


        CreateSmokeTest tester4 = new Tester("Merve", "SDET", 200_000);
        tester4.createSmokeTest(); // only has access to createSmokeTest method


        Tester tester5 = new Tester("Sevara", "SDET", 180_000);
        //Tester 5 has access to all wariables and methods
        //tester5.name;
        //tester5.jobTitle;
        //tester5.salary;
        tester5.createSmokeTest();
        tester5.work();
        tester5.writeBugReport();
    }
}
