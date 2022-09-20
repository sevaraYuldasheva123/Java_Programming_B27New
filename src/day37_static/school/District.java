package day37_static.school;

import day37_static.school.School;

public class District {

    public static void main(String[] args) {

        School.district = 149;
        School.totalTeachers = 100;
        School.totalStudents = 3000;

        School.totalTeachers--;
        System.out.println(School.totalTeachers);

        School.announcement();

        School middle = new School();
        middle.lunchTime = 12;
        middle.lunch();
    }
}
