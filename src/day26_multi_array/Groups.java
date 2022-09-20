package day26_multi_array;

import java.util.Arrays;

public class Groups {

    public static void main(String[] args) {

        String[][] cydeo = {
                {"Alen", "Tina", "Alina", "Nargiza"}, // <---- array on index 0
                {"Anam", "Baz", "Busra", "Ostap"}, //   <---- array on index 1
                {"Rabia", "Shahad"},    // <---- array on index 2
                {"Ketino", "Eylul", "Nadia"} // <---- array on index 3
        };
        System.out.println(cydeo.length); // <--- length is 4
        System.out.println(cydeo[2].length); // <--- length of 2nd array is 2
        System.out.println(cydeo[0][3]); // <--- will return Nazgiza , first array on index 3

        System.out.println(Arrays.toString(cydeo[1])); // <--- prints array on index 1
        System.out.println(Arrays.deepToString(cydeo)); // <--- prints the whole array

        System.out.println();
        //how to loop through each name in loop

        for(String[] eachName : cydeo){ // <-- String array is the type

            System.out.println(Arrays.toString(eachName));

        }

        System.out.println();

        //how to loop through each name
        for (String[] eachInner : cydeo ){

            for (String eachName : eachInner){

                System.out.println(eachName);
            }

        }

        System.out.println();

        //how to loop through each name
        for (String[] eachInner : cydeo ){

            for (String eachName : eachInner){

                System.out.println(eachName.substring(eachName.length()-1).toUpperCase());
            }

        }
    }
}
