package day17_string;

public class PrintLetters {

    public static void main(String[] args) {

        char first = 'A';

        while (first <= 'Z'){
            System.out.print(first);
            first++;
        }

        System.out.println();
        //printing backwords

        char last = 'z';

        while (last >=   'a'){
            System.out.print(last--);

        }



    }
}
