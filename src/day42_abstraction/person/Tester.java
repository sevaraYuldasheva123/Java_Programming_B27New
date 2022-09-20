package day42_abstraction.person;

public final class Tester extends Employee { // Employee extends Person as well


    public Tester(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("Running test cases");
        System.out.println("Finding locators");
    }

    @Override
    public void sleep(int hours) {
        System.out.println(name+" sleeps for "+ hours+" hours while automation code runs");
    }
}
