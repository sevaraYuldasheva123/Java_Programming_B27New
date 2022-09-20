package day10_if_statements;

public class IfWithNoBrackets {

    public static void main(String[] args) {

        if(3 < 9 ){
            System.out.println("first");
            System.out.println("second");
        }

        if(3 > 9 )
            System.out.println("third"); // here we close the if statement if there is no curly braces
            System.out.println("fourth");// this line does not belong to if statement


    }
}
