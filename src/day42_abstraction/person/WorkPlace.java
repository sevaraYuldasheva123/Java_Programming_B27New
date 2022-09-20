package day42_abstraction.person;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class WorkPlace {

    public static void main(String[] args) {

        //We cannot make Person and Employee Objects because they are the abstract classes
        //Person person = new Person();
        //Employee employee = new Employee();

        Tester tester1 = new Tester("Sevara", 35, "SDET", 130000);
        System.out.println(tester1);


        tester1.sleep( 8);
        tester1.work();

        ArrayList<Tester> testers = new ArrayList<>();
        testers.add(tester1);
        testers.addAll(Arrays.asList(
                new Tester("Bato", 30, "SDET", 150000),
                new Tester("Kate", 28, "SDET", 135000),
                new Tester("Olga", 29, "SDET", 110000)
        ));

        System.out.println();

        for (Tester each: testers){
            System.out.println(each);

            each.sleep(8);
            System.out.println();
        }
    }
}
