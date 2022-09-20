package day10_if_statements;

public class TernaryExample {

    public static void main(String[] args) {

        int score = 50;


        //if else
        if (score > 70){
            System.out.println("You are Passing!");
        }else {
            System.out.println("You are Failing");
        }

        System.out.println("==============================");

        //Version with variables
        int score2 = 50;
        String result;
        if (score2 > 70){
            result = "You are Passing!";
        }else {
            result = "You are Failing";
        }
        System.out.println(result);


        System.out.println("==============================");

        //Ternary
        int score3 = 80;
         //             if score3 is bigger then 70 pass , else fail
        String result2 = score3 > 70 ? "Passing" : "Failing";

        System.out.println("==============================");

        int n = 9;
        System.out.println(n % 2 == 0 ?"even" : "odd");

        System.out.println("==============================");


        boolean isGreen = false;
        System.out.println(isGreen? "drive":"stop"); // if is green is true drive, else stop

    }

}
