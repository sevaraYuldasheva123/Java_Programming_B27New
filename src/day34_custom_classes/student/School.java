package day34_custom_classes.student;

public class School {

    public static void main(String[] args) {

        Student student1 = new Student(); // we created object of the class in order to access its variables
        System.out.println(student1); // will return hashcode because there is no any values assigned yet

        student1.name = "Olena";
        student1.batchNumber = 27;
        student1.program = "SDET";
        student1.grade = 99.99;

        System.out.println(student1.name);
        System.out.println(student1.batchNumber);
        System.out.println(student1.program);
        System.out.println(student1.grade);

        System.out.println("=============================");
        Student student2 = new Student();
        System.out.println(student2.name);
        System.out.println(student2.batchNumber);
        System.out.println(student2.program);
        System.out.println(student2.grade);

        student1.study();

    }
}
