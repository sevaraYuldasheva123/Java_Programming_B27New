package day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingArray {

    public static void main(String[] args) {

        /*
        0 --> id
        1 --> first name
        2 --> last name
        3 --> batch number

         */

        String[] studentOne = {"04", "Kristina", "Gaidamovic" , "27"};
        System.out.println("Student one : "+ Arrays.toString(studentOne));
        System.out.println();

        String[] studentTwo = new String[4]; // no values here yet
        studentTwo[0] = "10";
        studentTwo[1] = "Olena";
        studentTwo[2] = "Kravetska";
        studentTwo[3] = "27";

        System.out.println("Student two : "+ Arrays.toString(studentTwo));
        System.out.println();


        // getting the values from the scanner
        Scanner input = new Scanner(System.in);
        String[] studentThree = new String[4];
        System.out.println("Enter your id");
        studentThree[0]= input.next();

        System.out.println("Enter your first name");
        studentThree[1] = input.next();

        System.out.println("Enter your last name");
        studentThree[2] = input.next();

        System.out.println("Enter your batch number");
        studentThree[3] = input.next();

        System.out.println("Student three: "+ Arrays.toString(studentThree));
        System.out.println();

        //most dynamic version:
        String[] studentFour = new String[4];
        String[] questions = {"id", "first name", "last name", "batch number"};

        for(int i = 0; i < studentFour.length; i++){

            System.out.println("Enter your "+questions[i]);
            studentFour[i] = input.next();

        }
        System.out.println("Student 4: "+ Arrays.toString(studentFour));







    }
}
