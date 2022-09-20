package day17_string;

public class RelativeChecker {

    public static void main(String[] args) {

        /*
        if the lastname same it means relatives
         */

        String name1 = "James Bond";
        String name2 = "Jamie Bond";

        int indexOfSpace = name1.lastIndexOf(" ");

        String lastName = name1.substring(indexOfSpace + 1); // from index of space till end is last name --> +1 is to skip the Space

        if(name2.endsWith(lastName)){
            System.out.println("You are related");
        }else {
            System.out.println("You are not related");
        }

        System.out.println();
        //turnery
        System.out.println(name2.endsWith(lastName) ? "Related" : "Not related");
    }
}
