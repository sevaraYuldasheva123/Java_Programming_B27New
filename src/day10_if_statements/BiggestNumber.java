package day10_if_statements;

public class BiggestNumber {

    public static void main(String[] args) {

        int first = 3;
        int second = 3;
        int third = 3;
        int biggest = 0;

        if(first > second && first > third){
            System.out.println("First number is the biggest");
            biggest = first;
        }else if(second > first && second > third){
            System.out.println("Second number is the biggest");
            biggest = second;
        }else {
            System.out.println("Third number is the biggest");
            biggest = third;
        }

        System.out.println("Biggest number --> "+biggest);


    }
}
