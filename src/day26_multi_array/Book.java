package day26_multi_array;

import java.util.Arrays;
import java.util.Scanner;

public class Book {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many chapters do you want to write");

        int chapters = input.nextInt();
        input.nextLine(); //to handle enter input

        String[][] book = new String[chapters][];

        for (int i = 0; i < chapters; i++){

            System.out.println("Type your chapter");
            book[i] = input.nextLine().trim().split(" ");// reading the string frome console, triming extra spaces and
            // then splitting the array by the spaces, getting a string array with each word as a separate element
        }

        System.out.println(Arrays.deepToString(book));

        //to read the array from begining to end
        for (int i = 0; i < book.length; i++){
            System.out.println(Arrays.toString(book[i]));
        }

        //print each word one at a time
        for (int i = 0; i < book.length; i++){

            for (int j = 0; j < book[i].length; j++){

                System.out.println(book[i][j]);
            }

        }
    }
}
